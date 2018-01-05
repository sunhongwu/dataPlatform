package com.service.rabbitmq.config;

/**
* @description RabbitMq队列信息声明
* @author haifeng
* @create 2017/12/25 17:14
**/
public class RabbitMqEnum {

    /**
     * 定义数据交换方式
     */
    public enum Exchange {
        CONTRACT_FANOUT("CONTRACT_FANOUT", "消息分发"),
        CONTRACT_TOPIC("CONTRACT_TOPIC", "消息订阅"),
        CONTRACT_DIRECT("CONTRACT_DIRECT", "点对点");

        private String code;
        private String name;

        Exchange(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }

    /**
     * 定义队列名称
     **/
    public enum QueueName {
        TESTQUEUE("TESTQUEUE", "测试队列"),
        TOPICTEST1("TOPICTEST1", "topic测试队列"),
        TOPICTEST2("TOPICTEST2", "topic测试队列");

        private String code;
        private String name;

        QueueName(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

    }

    /**
     * 定义routing_key
     **/
    public enum QueueEnum {
        TESTQUEUE("TESTQUEUE", "测试队列key"),
        TESTTOPICQUEUE1("*.TEST.*", "topic测试队列key"),
        TESTTOPICQUEUE2("lazy.#", "topic测试队列key");


        private String code;
        private String name;

        QueueEnum(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }
}
