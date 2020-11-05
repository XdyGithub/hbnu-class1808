package cn.hbnu.edu.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 聊天程序接收端线程
 *
 * @author 陈迪凯
 * @date 2020-11-05 9:01
 */
public class ChatReceive implements Runnable {
    private DatagramSocket datagramSocket;

    public ChatReceive(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // 2、定义数据报包，接收从发送端发送过来的数据
                byte[] buf = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);

                // 3、接收数据
                datagramSocket.receive(datagramPacket);

                // 4、取出从发送端发送过来的数据
                String ip = datagramPacket.getAddress().getHostAddress();
                String data = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                System.out.println(ip + ">>>>：" + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5、关闭资源
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }
    }
}
