package cn.hbnu.edu.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Url:  协议：//id地址：端口/项目/资源
 *  统一资源定位符。定位网络资源
 *
 * @author 陈迪凯
 * @date 2020-11-12 9:02
 */
public class UrlDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://127.0.0.1:8080/HelloWorld/index.jsp?username=chendikai&passowrd=123456");

            System.out.println(url.getProtocol());  // 获取协议
            System.out.println(url.getHost()); // 获取主机地址
            System.out.println(url.getPort()); // 获取端口
            System.out.println(url.getPath()); // 获取资源
            System.out.println(url.getFile()); // 获取资源全路径
            System.out.println(url.getQuery()); // 获取参数
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
