package com.service.rabbitmq.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @description RabbitMq交换机配置
* @author haifeng
* @create 2017/12/25 17:14
**/
@Configuration
@AutoConfigureAfter(RabbitMqConfig.class)
public class RabbitMqExchangeConfig {

    private Logger logger = LoggerFactory.getLogger( getClass() );
    /**
     * 广播型交换机
     */
    @Bean
    FanoutExchange contractFanoutExchangeDurable(RabbitAdmin rabbitAdmin){
        FanoutExchange contractFanoutExchange = new FanoutExchange(RabbitMqEnum.Exchange.CONTRACT_FANOUT.getCode());
        rabbitAdmin.declareExchange(contractFanoutExchange);
        logger.debug("完成分发型交换机[{}]实例化", "FanoutExchange");
        return contractFanoutExchange;
    }
    /**
     * 主题型交换机
     */
    @Bean
    TopicExchange contractTopicExchangeDurable(RabbitAdmin rabbitAdmin){
        TopicExchange contractTopicExchange = new TopicExchange(RabbitMqEnum.Exchange.CONTRACT_TOPIC.getCode());
        rabbitAdmin.declareExchange(contractTopicExchange);
        logger.debug("完成主题型交换机[{}]实例化", "TopicExchange");
        return contractTopicExchange;
    }
    /**
     * 直连型交换机
     */
    @Bean
    DirectExchange contractDirectExchange(RabbitAdmin rabbitAdmin) {
        DirectExchange contractDirectExchange = new DirectExchange(RabbitMqEnum.Exchange.CONTRACT_DIRECT.getCode());
        rabbitAdmin.declareExchange(contractDirectExchange);
        logger.debug("完成直连型交换机[{}]实例化", "DirectExchange");
        return contractDirectExchange;
    }

    //在此可以定义队列

    @Bean
    Queue queueTest(RabbitAdmin rabbitAdmin){
        Queue queue = new Queue(RabbitMqEnum.QueueName.TESTQUEUE.getCode());
        rabbitAdmin.declareQueue(queue);
        logger.debug("测试队列实例化完成");
        return queue;
    }

    //topic 1
    @Bean
    Queue queueTopicTest1(RabbitAdmin rabbitAdmin){
        Queue queue = new Queue(RabbitMqEnum.QueueName.TOPICTEST1.getCode());
        rabbitAdmin.declareQueue(queue);
        logger.debug("话题测试队列1实例化完成");
        return queue;
    }
    //topic 2
    @Bean
    Queue queueTopicTest2(RabbitAdmin rabbitAdmin){
        Queue queue = new Queue(RabbitMqEnum.QueueName.TOPICTEST2.getCode());
        rabbitAdmin.declareQueue(queue);
        logger.debug("话题测试队列2实例化完成");
        return queue;
    }


    //在此处完成队列和交换机绑定
    @Bean
    Binding bindingQueueTest(Queue queueTest, DirectExchange exchange, RabbitAdmin rabbitAdmin){
        Binding binding = BindingBuilder.bind(queueTest).to(exchange).with(RabbitMqEnum.QueueEnum.TESTQUEUE.getCode());
        rabbitAdmin.declareBinding(binding);
        logger.debug("测试队列与直连型交换机绑定完成");
        return binding;
    }
    //topic binding1
    @Bean
    Binding bindingQueueTopicTest1(Queue queueTopicTest1,TopicExchange exchange,RabbitAdmin rabbitAdmin){
        Binding binding = BindingBuilder.bind(queueTopicTest1).to(exchange).with(RabbitMqEnum.QueueEnum.TESTTOPICQUEUE1.getCode());
        rabbitAdmin.declareBinding(binding);
        logger.debug("测试队列与话题交换机1绑定完成");
        return binding;
    }

    //topic binding2
    @Bean
    Binding bindingQueueTopicTest2(Queue queueTopicTest2,TopicExchange exchange,RabbitAdmin rabbitAdmin){
        Binding binding = BindingBuilder.bind(queueTopicTest2).to(exchange).with(RabbitMqEnum.QueueEnum.TESTTOPICQUEUE2.getCode());
        rabbitAdmin.declareBinding(binding);
        logger.debug("测试队列与话题交换机2绑定完成");
        return binding;
    }

}
