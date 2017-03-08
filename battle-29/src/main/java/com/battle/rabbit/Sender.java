package com.battle.rabbit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Bing.Z on 2017/3/8.
 */
@Component
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(){
        String content = "hello" + new Date();
        System.out.println("sender" + content);
        this.rabbitTemplate.convertAndSend("hello",content);

    }

}
