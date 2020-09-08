package org.my.cloud.test.recursionAlgorithm;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author Liq
 * @Date 2020-08-06 15:12
 */
public class RecurMain {

    /**
     * 递归算法--九九乘法表
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(System.currentTimeMillis())));
        haskell(9);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(System.currentTimeMillis())));
    }

    public static void haskell(int i) {

        if (i == 1) {
            System.out.println("1 * 1 = 1");
        } else {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + " * " + i + " = " + j * i + "\t");
            }
            haskell(i - 1);
        }

    }


}
