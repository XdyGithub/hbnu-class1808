package cn.hbnu.edu.net;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文本文件上传至服务器
 *
 * @author 陈迪凯
 * @date 2020-11-10 16:33
 */
public class TcpServer04 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并监听端口
            ServerSocket serverSocket = new ServerSocket(8888);

            // 2、获取socket连接对象
            Socket socket = serverSocket.accept();

            // 3、获取流对象
            // socket输入流，用于接收客户端发送过来的数据
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 文件输出流，用于将客户端上传的文件内容写入到服务器中的指定文件
            PrintWriter printWriter = new PrintWriter(new FileWriter("E:\\DingLi\\jixin1809.txt"), true);
            // socket输出流，用于反馈结果给客户端
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // DataInputStream dis = new DataInputStream(socket.getInputStream());
            // long time = dis.readLong();

            // 4、获取客户端发送的数据，并将数据写入服务器中的指定文件
            String line = null;
            while ((line = in.readLine()) != null) {
                // if ("over".equals(line)) {
                //     break;
                // }

                // if ((time + "").equals(line)) {
                //     break;
                // }
                // 5、将读到的数据写入指定文件
                printWriter.println(line);
            }

            // 6、返回结果给客户端
            out.println("文件上传成功");

            // 7、关闭资源
            printWriter.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
