package cn.hbnu.edu.net;

import javax.naming.NamingEnumeration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 模拟用户登录——客户端
 *
 * @author 陈迪凯
 * @date 2020-11-12 8:09
 */
public class TcpClient08 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并指定服务器端的ip和端口
            Socket socket = new Socket("127.0.0.1", 8888);

            // 2、获取流对象
            // 键盘输入流，用于获取键盘输入的数据
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // socket输出流，用于发送数据给服务器端
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // socket输入流，用于接收服务器端返回的结果
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 3、将键盘输入的数据发送给服务器端
            for (int i = 0; i < 3; i++) {
                String name = bufferedReader.readLine(); // 获取键盘输入的数据

                if (name == null) {
                    break;
                }

                // 4、将键盘输入的数据发送给服务器端
                out.println(name);

                // 5、接收服务器端返回的结果
                String result = in.readLine();
                System.out.println(result);

                if (result.contains("欢迎")) {
                    break;
                }
            }

            // 6、关闭资源
            bufferedReader.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
