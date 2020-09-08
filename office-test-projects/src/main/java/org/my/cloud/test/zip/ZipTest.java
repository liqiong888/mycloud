package org.my.cloud.test.zip;

import org.my.cloud.test.zip.Utils.Uzip;

import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Author Liq
 * @Date 2020-08-06 13:58
 */
public class ZipTest {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        Uzip uzip = new Uzip();
        String input = "D:" + File.separator + "nuget" + File.separator + "nuget.txt";
        String output = "D:" + File.separator + "nuget" + File.separator + "nuget.zip";
        String basePath = "D:" + File.separator + "nuget";
        uzip.zip(input, output, basePath, null);

    }
}
