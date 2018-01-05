package com.service.rabbitmq.config;


import com.service.param.def.EnvProperityName;
import com.service.platform.bootstrap.PropertiesLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
/**
* @description Rattbit连接配置
* @author haifeng
* @create 2017/12/25 17:13
**/
@Configuration
public class RabbitMqConfig {

    private Logger logger = LoggerFactory.getLogger( getClass() );

    private String addresses;
    private String username;
    private String password;
    private Boolean publisherConfirms;
    private String virtualHost;

    @Autowired
    private PropertiesLoader loader;

    public boolean init(){
        if(loader==null){
            logger.error("Rabbit配置参数加载失败：PropertiesLoader is null");
            return false;
        }
        addresses = loader.getProperty( EnvProperityName.rabbitmqAddresses.name() );
        username = loader.getProperty( EnvProperityName.rabbitmqUsername.name() );
        password = loader.getProperty( EnvProperityName.rabbitmqPassword.name() );
        String confirmStr =  loader.getProperty( EnvProperityName.rabbitmqPublisherConfirms.name() );
        if("true".equals(confirmStr)){
            publisherConfirms = true;
        }else{
            publisherConfirms = false;
        }
        virtualHost = loader.getProperty( EnvProperityName.rabbitmqVirtualHost.name() );
        if(addresses==null || username==null || password==null || virtualHost==null){
            logger.error("Rabbit配置参数加载失败：数据库未成功配置");
            return false;
        }else{
            logger.info("Rabbit配置参数加载成功："+addresses+"(username="+username+",virtualHost="+virtualHost+")");
            return true;
        }
    }

    @Bean
    public ConnectionFactory connectionFactory(){
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        if(!init()){
            return connectionFactory;
        }
        connectionFactory.setAddresses(addresses);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setPublisherConfirms(publisherConfirms);
        connectionFactory.setVirtualHost(virtualHost);
        return connectionFactory;
    }

    @Bean
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory){
        return new RabbitAdmin(connectionFactory);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RabbitTemplate rabbitTemplate(){
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        return template;
    }
}
