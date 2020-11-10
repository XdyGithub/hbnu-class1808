package cn.hbnu.edu.net;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 文本文件上传至服务器
 *
 * @author 陈迪凯
 * @date 2020-11-10 16:23
 */
public class TcpClient04 {

    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并指定服务器端的ip和端口port
            Socket socket = new Socket("127.0.0.1", 8888);

            // 2、获取流对象
            // 文件读取流，用于获取文件的内容
            BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\src\\jdbc.properties"));
            // socket输出流，用于向服务器端发送数据
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // socket输入流，用于接收服务器端返回的结果
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            // long time = System.currentTimeMillis(); // 获取当前时间戳
            // dos.writeLong(time);

            // 3、获取文件数据，并将文件数据发送给服务器端
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                // 4、将文件数据发送给服务器端
                out.println(line);
            }
            // out.println("over");
            // out.println(time + "");
            socket.shutdownOutput();  //关闭输出流

            // 5、接收服务器端返回的结果
            String result = in.readLine();
            System.out.println(result);

            // 6、关闭资源
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
