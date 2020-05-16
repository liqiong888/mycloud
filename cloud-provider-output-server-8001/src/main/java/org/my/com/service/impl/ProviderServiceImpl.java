package org.my.com.service.impl;

import org.my.com.service.ProviderService;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)//定义消息的推送通道
public class ProviderServiceImpl implements ProviderService {

    @Resource
    private MessageChannel output;//消息发送管道


    public String send() {

        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial*****"+serial);
        return null;
    }
}
