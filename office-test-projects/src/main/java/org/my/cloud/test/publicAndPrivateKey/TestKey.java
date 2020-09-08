package org.my.cloud.test.publicAndPrivateKey;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;

/**
 * @Description
 * @Author Liq
 * @Date 2020-09-08 10:47
 */

/**
 * 密码学基础
 * 在正式讲解HTTPS协议之前，我们首先要知道一些密码学的知识。
 *
 * 明文： 明文指的是未被加密过的原始数据。
 * 密文：明文被某种加密算法加密之后，会变成密文，从而确保原始数据的安全。密文也可以被解密，得到原始的明文。
 * 密钥：密钥是一种参数，它是在明文转换为密文或将密文转换为明文的算法中输入的参数。密钥分为对称密钥与非对称密钥，分别应用在对称加密和非对称加密上。
 *
 * 对称加密：对称加密又叫做私钥加密，即信息的发送方和接收方使用同一个密钥去加密和解密数据。对称加密的特点是算法公开、加密和解密速度快，适合于对大数据量进行加密，常见的对称加密算法有DES、3DES、TDEA、Blowfish、RC5和IDEA。
 * 其加密过程如下：明文 + 加密算法 + 私钥 => 密文
 * 解密过程如下： 密文 + 解密算法 + 私钥 => 明文
 *
 * 对称加密中用到的密钥叫做私钥，私钥表示个人私有的密钥，即该密钥不能被泄露。
 * 其加密过程中的私钥与解密过程中用到的私钥是同一个密钥，这也是称加密之所以称之为“对称”的原因。由于对称加密的算法是公开的，所以一旦私钥被泄露，那么密文就很容易被破解，所以对称加密的缺点是密钥安全管理困难。
 *
 * 非对称加密：非对称加密也叫做公钥加密。非对称加密与对称加密相比，其安全性更好。对称加密的通信双方使用相同的密钥，如果一方的密钥遭泄露，那么整个通信就会被破解。而非对称加密使用一对密钥，即公钥和私钥，且二者成对出现。私钥被自己保存，不能对外泄露。公钥指的是公共的密钥，任何人都可以获得该密钥。用公钥或私钥中的任何一个进行加密，用另一个进行解密。
 * 被公钥加密过的密文只能被私钥解密，过程如下：
 * 明文 + 加密算法 + 公钥 => 密文， 密文 + 解密算法 + 私钥 => 明文
 * 被私钥加密过的密文只能被公钥解密，过程如下：
 * 明文 + 加密算法 + 私钥 => 密文， 密文 + 解密算法 + 公钥 => 明文
 *
 * 由于加密和解密使用了两个不同的密钥，这就是非对称加密“非对称”的原因。
 * 非对称加密的缺点是加密和解密花费时间长、速度慢，只适合对少量数据进行加密。
 * 在非对称加密中使用的主要算法有：RSA、Elgamal、Rabin、D-H、ECC（椭圆曲线加密算法）等。
 *
 * 作者：Leon_hy
 * 链接：https://www.jianshu.com/p/14cd2c9d2cd2
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class TestKey {

    /**
     * 公钥加密---私钥解密
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // 待加解密的消息
        byte[] msg = "test!中文".getBytes("UTF8");

        // 用证书的公钥加密
        CertificateFactory cff = CertificateFactory.getInstance("X.509");
        // 证书文件
        FileInputStream fis1 = new FileInputStream("D://MyKeyStore//TestKey2.cer");
        Certificate cf = cff.generateCertificate(fis1);
        // 得到证书文件携带的公钥
        PublicKey pk1 = cf.getPublicKey();
        // 定义算法：RSA
        Cipher c1 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        c1.init(Cipher.ENCRYPT_MODE, pk1);
        // 加密后的数据
        byte[] msg1 = c1.doFinal(msg);
        System.out.println("加密信息" + new String(msg1, "UTF8"));
        // 用证书的私钥解密 - 该私钥存在生成该证书的密钥库中
        FileInputStream fis2 = new FileInputStream("D://MyKeyStore//TestStore");
        // 加载证书库
        KeyStore ks = KeyStore.getInstance("JKS");
        // 证书库密码
        char[] kspwd = "000000".toCharArray();
        // 证书密码
        char[] keypwd = "000000".toCharArray();
        // 加载证书
        ks.load(fis2, kspwd);
        // 获取证书私钥
        PrivateKey pk2 = (PrivateKey) ks.getKey("TestKey2", keypwd);
        fis2.close();
        Cipher c2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        c2.init(Cipher.DECRYPT_MODE, pk2);
        // 解密后的数据
        byte[] msg2 = c2.doFinal(msg1);

        // 将解密数据转为字符串
        System.out.println(new String(msg2, "UTF8"));
    }
}
