package org.my.cloud.test.sha1;


import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

/**
 * @Description
 * @Author Liq
 * @Date 2020-08-14 11:31
 */
public class tetMain {

    private static final Logger LOG = LoggerFactory.getLogger(tetMain.class);
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final char[] DIGITS;
    static {
        DIGITS =
                new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
                        'e', 'f'};
    }
    /**
     * 将sha1方式加密后的密文拼接21次之后再用sha512加密
     */
    public static String customSha512(String password) {
        StringBuilder appendedString = new StringBuilder();
        //将sha1加密后的字段拼接21次，相当于加盐
        for (int i = 1; i <= 21; i++) {
            appendedString.append(password);
        }
        return DigestUtils.sha512Hex(appendedString.toString());
    }
    public static String sha1(String data, String charset) {
        try {
            byte[] msg = data.getBytes(charset);
            MessageDigest md = MessageDigest.getInstance("SHA1");
            return encodeHex(md.digest(msg));
        } catch (Exception e) {
            LOG.error("execute SHA1 error",e);
        }
        return null;
    }
    private static String encodeHex(byte[] data) {
        int l = data.length;
        char[] out = new char[l << 1];
        int i = 0;

        for (int j = 0; i < l; ++i) {
            out[j++] = DIGITS[(240 & data[i]) >>> 4];
            out[j++] = DIGITS[15 & data[i]];
        }

        return new String(out);
    }

    public static String sha1(String data) {
        return sha1(data, DEFAULT_CHARSET);
    }
    public static void main(String[] args) {

        String s = sha1("123456");
        String s1 = customSha512(s);
        LOG.info("this is pw:[{}]",s+"\n"+s1);

    }
}
