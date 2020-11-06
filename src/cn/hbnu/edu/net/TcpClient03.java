package cn.hbnu.edu.net;

import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 建立一个文本转换服务器，客户端给服务端发送文本数据，
 * 服务端收到数据后将文本转为大写返回给客户端，
 * 客户端可以不断输入文本数据，当客户端输入over时，转换结束
 *
 * @author 陈迪凯
 * @date 2020-11-06 10:53
 */
public class TcpClient03 {
    public static void main(String[] args) {
        Socket socket = null;

        try {
            // 1、创建socket服务，并指定ip和端口
            socket = new Socket("127.0.0.1", 8888);

            // 2、获取流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // 获取从键盘录入的数据
            // BufferedWriter bufferedOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 将数据发送给服务器端
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedIn = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 获取服务器端返回的数据

            // 3、获取键盘输入的数据
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if ("over".equalsIgnoreCase(line)) {
                    break;
                }

                // 4、将数据发送给服务器
                // bufferedOut.write(line);
                // bufferedOut.newLine();
                // bufferedOut.flush(); // 刷新缓冲区
                printWriter.println(line);

                // 5、获取从服务器端返回来的数据
                String result = bufferedIn.readLine();
                System.out.println("服务器端返回来的数据：" + result);
            }

            bufferedReader.close();

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
