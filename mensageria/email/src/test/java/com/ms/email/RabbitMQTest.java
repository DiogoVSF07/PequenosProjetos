package com.ms.email;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQTest implements CommandLineRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Testando conexão com RabbitMQ...");
        rabbitTemplate.convertAndSend("default.email", "Mensagem de teste");
        System.out.println("Mensagem de teste enviada para default.email");
    }
}
