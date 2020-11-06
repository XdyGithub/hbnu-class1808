package cn.hbnu.edu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端和服务器端数据交互
 *
 * @author 陈迪凯
 * @date 2020-11-06 10:35
 */
public class TcpServer02 {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            // 1、创建socket服务，并监听端口
            serverSocket = new ServerSocket(8888);

            // 2、获取连接
            socket = serverSocket.accept();

            // 3、获取socket的输入流和输出流
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            // 4、获取客户端发送过来的数据，并处理数据
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println(new String(buf, 0, len));

            // 5、给客户端反馈信息
            out.write("收到，你也好".getBytes());
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
