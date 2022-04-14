package com.example.consumer;

import com.example.consumer.config.rabbitmq.RabbitMQConfig;
import com.example.consumer.model.message.UserMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void listener(UserMessage message) {
        System.out.println(message);
    }
}
