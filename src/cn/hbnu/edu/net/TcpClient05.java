package cn.hbnu.edu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 对象序列化，通过网络进行传输
 *
 * @author 陈迪凯
 * @date 2020-11-10 17:31
 */
public class TcpClient05 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，指定服务器端ip和端口port
            Socket socket = new Socket("127.0.0.1", 8888);

            // 2、获取流对象
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 3、传输对象
            User user = new User();
            user.setName("jixin1808");
            user.setAge(18);
            out.writeObject(user);

            // 4、获取服务器端返回的结果
            String result = in.readLine();
            System.out.println(result);

            // 5、关闭资源
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
