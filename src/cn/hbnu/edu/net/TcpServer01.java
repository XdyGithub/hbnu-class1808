package cn.hbnu.edu.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端接收一次数据
 *
 * @author 陈迪凯
 * @date 2020-11-06 10:11
 */
public class TcpServer01 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            // 1、创建socket服务，并监听端口
            serverSocket = new ServerSocket(8888);

            // 2、获取连接
            socket = serverSocket.accept();  // 阻塞式方法

            // 3、获取socket的输入流
            InputStream in = socket.getInputStream();

            // 4、读取客户端发送过来的数据
            byte[] buf = new byte[1024];
            int len = in.read(buf); // read()方法是阻塞式方法

            // 5、处理数据
            System.out.println(new String(buf, 0, len));

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

            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
