package cn.hbnu.edu.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress常见方法测试
 *
 * @author 陈迪凯
 * @date 2020-11-04 11:08
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());

            InetAddress inetAddress1 = InetAddress.getByName("192.168.1.107");
            System.out.println(inetAddress1.getHostAddress());
            System.out.println(inetAddress1.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
