package cn.hbnu.edu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 聊天程序发送端线程
 *
 * @author 陈迪凯
 * @date 2020-11-05 8:53
 */
public class ChatSend implements Runnable {
    private DatagramSocket datagramSocket;

    public ChatSend(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        try {
            // 从键盘录入数据
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                byte[] buf = line.getBytes();
                // 2、将需要发送的数据封装到数据报包中,DatagramPacket(byte[] buf, int length, InetAddress address, int port)
                DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.255"), 6666);

                // 3、发送数据报包
                datagramSocket.send(datagramPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 4、关闭资源
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }
    }
}
