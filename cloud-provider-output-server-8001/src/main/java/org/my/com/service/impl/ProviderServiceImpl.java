package org.my.com.service.impl;

import org.my.com.entities.Users;
import org.my.com.service.ProviderService;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;


/**
 * @EnableBinding(Source.class)//定义消息的推送通道
 */
@EnableBinding(Source.class)
/**
 * @author LQ
 */
public class ProviderServiceImpl implements ProviderService {

    @Resource
    /**
     * 消息发送管道
     */
    private MessageChannel output;


    public String send() {

        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial*****" + serial);
        return null;
    }

    public void send2() {

        output.send(MessageBuilder.withPayload(Users.builder()
                .company("测试公司")
                .phone("15594952639")
                .build())
                .build());
    }
}


