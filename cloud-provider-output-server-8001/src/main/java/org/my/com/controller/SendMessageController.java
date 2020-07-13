package org.my.com.controller;

import org.my.com.service.impl.ProviderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {

    @Resource
    private ProviderServiceImpl providerServiceImpl;


    @GetMapping("/sendMessage")
    public String sendMessage() {
        return providerServiceImpl.send();
    }


    @GetMapping("/sendMessage2")
    public void sendMessage2() {
        providerServiceImpl.send2();
    }
}
