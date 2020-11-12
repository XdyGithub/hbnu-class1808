package cn.hbnu.edu.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 陈迪凯
 * @date 2020-11-11 11:09
 */
public class TcpServer07 {
    public static void main(String[] args) {
        try {
            // 1、创建socket服务，并监听端口
            ServerSocket serverSocket = new ServerSocket(6666);

            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new TcpServer07Thread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
