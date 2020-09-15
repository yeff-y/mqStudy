package com.yeff.mq.mqTest.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    // 消息队列名称
    public static final String TEST_QUEUE = "q_hello";
    // 消息队列交换机
    public static final String TEST_EXCHANGE = "yeff_q_hello";
    // 消息队列路由
    public static final String TEST_ROUTING = "q_hello";

    @Bean
    public Queue queue() {
        return new Queue("q_hello");
    }

    @Bean
    public DirectExchange seckillExchange() {
        return new DirectExchange(TEST_EXCHANGE, true, false);
    }

    @Bean
    public Binding bindingDirect() {
        return BindingBuilder.bind(queue()).to(seckillExchange()).with(TEST_ROUTING);
    }
}
