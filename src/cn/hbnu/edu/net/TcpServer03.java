package cn.hbnu.edu.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 建立一个文本转换服务器，客户端给服务端发送文本数据，
 * 服务端收到数据后将文本转为大写返回给客户端，
 * 客户端可以不断输入文本数据，当客户端输入over时，转换结束
 *
 * @author 陈迪凯
 * @date 2020-11-06 11:06
 */
public class TcpServer03 {

    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并监听端口
            ServerSocket serverSocket = new ServerSocket(8888);

            // 2、获取socket连接
            Socket socket = serverSocket.accept();

            // 3、获取流
            BufferedReader bufferedIn = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 获取客户端发送过来的数据
            // BufferedWriter bufferedOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 向客户端反馈数据
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            // 4、读取客户端发送过来的数据
            String line = null;
            while ((line = bufferedIn.readLine()) != null) {
                System.out.println("客户端发送过来的数据：" + line);
                // bufferedOut.write(line.toUpperCase()); // 将客户端的数据转为大写。并返回给客户端
                // bufferedOut.newLine();
                // bufferedOut.flush();
                printWriter.println(line.toUpperCase());
            }

            // 6、关闭资源
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
