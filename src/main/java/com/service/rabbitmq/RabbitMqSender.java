package com.service.rabbitmq;

import com.service.rabbitmq.config.RabbitMqEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
* @description RabbitMq发送
* @author haifeng
* @create 2017/12/25 17:12
**/
@Component
public class RabbitMqSender implements RabbitTemplate.ConfirmCallback{

    private Logger logger = LoggerFactory.getLogger( getClass() );

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitMqSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        this.rabbitTemplate.setConfirmCallback(this);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        logger.info("confirm: " + correlationData.getId());
    }

    /**
     * 发送到指定routekey的指定queue
     */
    public void sendRabbitmqDirect(String queue,Object obj) {
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        logger.info("send: " + correlationData.getId());
        this.rabbitTemplate.convertAndSend(RabbitMqEnum.Exchange.CONTRACT_DIRECT.getCode(), queue , obj, correlationData);
    }

    /**
     * 所有发送到Topic Exchange的消息被转发到所有关心RouteKey中指定Topic的Queue上
     */
    public void sendRabbitmqTopic(String routeKey,Object obj) {
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        logger.info("send: " + correlationData.getId());
        this.rabbitTemplate.convertAndSend(RabbitMqEnum.Exchange.CONTRACT_TOPIC.getCode(), routeKey , obj, correlationData);
    }

}
