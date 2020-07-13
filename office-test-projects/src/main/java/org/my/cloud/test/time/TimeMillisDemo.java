package org.my.cloud.test.time;

import java.util.Date;

/**
 * @Description
 * @Author Liq
 * @Date 2020-05-21 9:48
 */


public class TimeMillisDemo {
    /**
     * 获取当前毫秒数：System.currentTimeMillis(); 而不是new Date().getTime();
     * 说明：如果想获取更加精确的纳秒级时间值，用System.nanoTime。
     * 在JDK8中，针对统计时间等场景，推荐使用Instant类。
     *
     * @param args
     */
    public static void main(String args[]) {
        // Positive example:肯定的例子
        long a = System.currentTimeMillis();
        // Negative example:否定的例子
        long b = new Date().getTime();
        long nanoTime = System.nanoTime();

        System.out.println(a);
        System.out.println(b);
        System.out.println(nanoTime);
    }

}
