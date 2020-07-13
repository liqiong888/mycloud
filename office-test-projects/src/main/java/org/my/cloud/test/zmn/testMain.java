package org.my.cloud.test.zmn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class testMain {

    /**
     * 测试获取resources目录的文件
     */
//    public static void main(String[] args) {
//
//        String url = testMain.class.getClassLoader().getResource("data/test.zip").getPath();
//        System.out.print(url);
//    }

    /**
     * 测试字符串拼接
     */
//public static void main(String[] args) {
//
//    for (int i = 0; i < 10; i++) {
//        System.out.println(i+1);
//    }
//}


//    private static final String URI = "http://192.168.0.187:8080/cp3/webInterface/%s.action";
//
//    public static void main(String[] args) {
//        String url = String.format(URI, "testMain");
//        System.out.println("  url  :" + url);
//    }

    /**
     * 测试休眠时间
     */
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

    public String get() throws InterruptedException {
        System.out.println("----------" + df.format(new Date()));
        if (true) {

            Thread.sleep(10000);
            String value = getValue(1);
            return value;
        }
        return "exit";
    }

    public String getValue(Integer id) {
        return id.toString() + "***" + UUID.randomUUID();
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        testMain testMain = new testMain();
        String s = testMain.get();
        System.out.println(s);
        System.out.println("********" + df.format(new Date()));
    }
    /**
     * java8 stream
     */
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            String result = UUID.randomUUID() + "----" + Integer.valueOf(i).toString();
//            list.add(result);
//        }
//        list.stream().forEach(System.out::println);
//    }
}
