//package org.my.com.test;
//
//import org.my.com.bean.User;
//import org.my.com.center.EventBusCenter;
//import org.my.com.listener.ListenerMessage;
//
///**
// * @Description
// * @Author Liq
// * @Date 2020-05-19 10:51
// */
//public class Test {
//
//    public static void main(String[] args) {
//        ListenerMessage observer1 = new ListenerMessage();
//
//        EventBusCenter.register(observer1);
//
//        System.out.println("============  start  ====================");
//
//        // 只有注册的参数类型为String的方法会被调用
//
//        EventBusCenter.post(User.builder()
//                .id(1)
//                .name("haha")
//                .build());
//
//        System.out.println("============    end          =============");
//    }
//}
