package org.my.com.evenbusprovider9002.controller;

import com.google.common.eventbus.EventBus;
import org.my.com.bean.User;
import org.my.com.evenbusprovider9002.center.EventBusCenter;
import org.my.com.listener.ListenerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author Liq
 * @Date 2020-05-19 11:15
 */
@RestController
public class SendController {

    @Autowired
    private EventBus eventBus;
    @GetMapping("/send")
    public void send() {
        ListenerMessage listenerMessage = new ListenerMessage();
        eventBus.post(User.builder()
                .id(001).name("周星驰").build());
        EventBusCenter.register(listenerMessage);
        EventBusCenter.post(User.builder()
                .id(001).name("周星驰").build());

    }


}
