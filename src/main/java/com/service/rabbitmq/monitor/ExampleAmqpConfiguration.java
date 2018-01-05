package com.service.rabbitmq.monitor;

import com.google.gson.Gson;
import com.rabbitmq.client.Channel;
import com.service.dao.entity.TestEntity;
import com.service.platform.util.SerializeUtil;
import com.service.rabbitmq.config.RabbitMqConfig;
import com.service.rabbitmq.config.RabbitMqEnum;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/12/8.
 */
@Configuration
@AutoConfigureAfter(RabbitMqConfig.class)
public class ExampleAmqpConfiguration {

    private Logger logger = LoggerFactory.getLogger( getClass() );

    @Bean("testQueueContainer")
    public MessageListenerContainer messageListenerContainer(ConnectionFactory connectionFactory) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(RabbitMqEnum.QueueName.TESTQUEUE.getCode(), RabbitMqEnum.QueueName.TOPICTEST1.getCode());
        container.setMessageListener(exampleListener());
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        return container;
    }


    @Bean("testQueueListener")
    public ChannelAwareMessageListener exampleListener() {
        return new ChannelAwareMessageListener() {
            @Override
            public void onMessage(Message message, Channel channel) throws Exception {
                TestEntity testEntity = (TestEntity) SerializeUtil.unserialize(message.getBody());
                //通过设置TestUser的name来测试回调，分别发两条消息，一条UserName为1，一条为2，查看控制台中队列中消息是否被消费
                if(testEntity==null){
                    System.out.println("获取到消息无法正常解析");
                    //手动ack（消息id，是否批量处理小于id的消息）
                    channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
                    return;
                }
                Gson gson = new Gson();
                logger.info("监听到消息："+gson.toJson(testEntity));
                if (testEntity.getId()<50){
                    logger.info("处理成功，"+testEntity.getId()+"<50");
                    //手动ack（消息id，是否批量处理小于id的消息）
                    channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
                }else{
                    logger.info("处理失败，决定放回队列中");
                    //（消息id，是否批量处理小于id的消息，是否重新true放入队列或false抛弃此条消息）
                    channel.basicNack(message.getMessageProperties().getDeliveryTag(),false,true);
                }
            }
        };
    }

}
