package org.my.com.center;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description
 * @Author Liq
 * @Date 2020-05-19 10:49
 */
public class EventBusCenter {

    private static EventBus eventBus = new EventBus();


    private EventBusCenter() {

    }

    public static EventBus getInstance() {

        return eventBus;

    }
//注册
    public static void register(Object obj) {

        eventBus.register(obj);

    }

    public static void unregister(Object obj) {

        eventBus.unregister(obj);

    }

    public static void post(Object obj) {

        eventBus.post(obj);

    }
}
