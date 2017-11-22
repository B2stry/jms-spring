package com.shallow.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppProducer {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producerService = applicationContext.getBean(ProducerService.class);
        for (int i = 0; i < 100; i++) {
            producerService.sendMessage("test" + i);
        }

        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
