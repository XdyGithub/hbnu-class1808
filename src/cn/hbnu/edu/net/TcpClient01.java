package cn.hbnu.edu.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端发送一次数据
 *
 * @author 陈迪凯
 * @date 2020-11-06 10:05
 */
public class TcpClient01 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            // 1、创建socket服务,并指定服务器端的ip和端口
            socket = new Socket("127.0.0.1", 8888);

            // 2、准备发送的数据,获取socket的输出流
            byte[] buf = "hbnu jixin 1808".getBytes();
            OutputStream out = socket.getOutputStream();

            // 3、发送数据
            out.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4、关闭资源
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
