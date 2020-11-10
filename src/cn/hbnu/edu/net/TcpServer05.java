package cn.hbnu.edu.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 对象序列化，通过网络进行传输
 *
 * @author 陈迪凯
 * @date 2020-11-10 17:36
 */
public class TcpServer05 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务。监听端口
            ServerSocket serverSocket = new ServerSocket(8888);

            // 2、获取socket连接对象
            Socket socket = serverSocket.accept();

            // 3、获取流对象
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // 4、获取客户端发送的对象
            User user = (User) in.readObject(); // 对象反序列化
            System.out.println(user.getName() + ":" + user.getAge());

            // 5、返回结果给客户端
            out.println("对象序列化成功");

            // 6、关闭资源
            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
