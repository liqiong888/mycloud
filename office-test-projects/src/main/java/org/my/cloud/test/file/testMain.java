package org.my.cloud.test.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description
 * @Author Liq
 * @Date 2020-09-03 18:25
 */
public class testMain {

    public static void main(String[] args) throws IOException {

//        File f = new File("D:\\file\\test.sh");
//        if (f.exists()) {
//            f.delete();
//        }
//        f.createNewFile();
//
//        String cmd = f.getAbsolutePath();
//        System.out.println(cmd);
        String s = "coding.csl.anchnet.com";
        String s1 = String.format(s, "asdfasd");
        System.out.println(s1);

    }
}
