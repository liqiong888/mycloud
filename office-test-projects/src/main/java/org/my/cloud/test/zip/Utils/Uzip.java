package org.my.cloud.test.zip.Utils;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Description
 * @Author Liq
 * @Date 2020-08-06 14:02
 */
public class Uzip {
    /**
     * 压缩
     * String input ：定义的是待压缩文件的条目。
     * <p>
     * String output：定义得到的压缩文件包.zip的名字。
     * <p>
     * String name：定义压缩后的条目的名字，如果与压缩前保持一致，定义name为null即可。
     */
    public void zip(String input, String output, String basePath, String name) throws IOException {

        try {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(output));
            File file = new File(input);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files.length == 0) {
                    out.putNextEntry(new ZipEntry(basePath + File.separator));
                    out.closeEntry();
                }
                for (File data : files) {
                    zip(basePath + File.separator + data.getName(), output, basePath, null);
                }
            } else {
                FileInputStream fis = new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(fis);
                byte[] buf = new byte[1024];
                int len;
                while ((len = bis.read(buf)) > 0) {
                    System.out.println("file name "+file.getName());
                    out.putNextEntry(new ZipEntry(file.getName()));
                    out.write(buf, 0, len);
                }
                if (bis != null) {
                    bis.close();
                }
                if (fis != null) {
                    fis.close();
                }
            }


            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
