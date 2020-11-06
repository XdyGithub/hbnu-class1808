package cn.hbnu.edu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端和服务器端数据交互
 *
 * @author 陈迪凯
 * @date 2020-11-06 10:29
 */
public class TcpClient02 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            // 1、创建socket服务，并指定ip和端口
            socket = new Socket("127.0.0.1", 8888);

            // 2、获取socket服务的输出流和输入流
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            // 3、准备数据，并发送给服务端
            out.write("服务端，你好".getBytes());

            // 4、接收服务器端返回的数据
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);

            // 5、处理服务器端返回的数据
            System.out.println(new String(bytes, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6、关闭资源
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
