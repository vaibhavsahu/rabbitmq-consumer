package com.vaibhav.example.rabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConsumer {
    @RabbitListener(queues = "${test.rabbitmq.queue}")
    public void recievedMessage(Employee employee) {
        System.out.println("Recieved Message From RabbitMQ: " + employee);
    }
}
