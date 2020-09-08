package org.my.cloud.test.高并发;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Author Liq
 * @Date 2020-08-07 11:33
 */
public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        int count = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for (int i = 0; i < count; i++) {
            Task task = new TestMain().new Task();
            task.init("test" + i, i);
            executorService.execute(task);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class Task implements Runnable {
        private String name;
        private Integer num;

        public void init(String name, Integer num) {
            this.name = name;
            this.num = num;
        }

        @Override
        public void run() {
            synchronized (Task.class) {
                try {
                    // 测试内容
                    System.out.println("this is " + name + " num   " + num);
//                    System.out.println("" + Thread.currentThread().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}