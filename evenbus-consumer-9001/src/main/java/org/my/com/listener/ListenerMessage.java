package org.my.com.listener;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import lombok.Value;
import org.my.com.bean.User;

/**
 * @Description
 * @Author Liq
 * @Date 2020-05-19 10:48
 */
public class ListenerMessage {


    @AllowConcurrentEvents
    @Subscribe
    public void func(User user) {
        System.out.println("Object User:9001 " + user);
    }

}
