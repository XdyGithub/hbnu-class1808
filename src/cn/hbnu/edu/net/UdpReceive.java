package cn.hbnu.edu.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP 接收端
 *
 * @author 陈迪凯
 * @date 2020-11-04 11:28
 */
public class UdpReceive {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            // 1、建立udp socket服务
            datagramSocket = new DatagramSocket(8888);

            while (true) {
                // 2、定义数据报包，用于接收从发送端发送过来的数据
                byte[] buf = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);

                // 3、接收数据
                datagramSocket.receive(datagramPacket); // 阻塞式方法

                // 4、取出数据
                String ip = datagramPacket.getAddress().getHostAddress();
                int port = datagramPacket.getPort();
                String data = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                System.out.println(ip + ":" + port + ">>>>" + data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5、关闭资源
            datagramSocket.close();
        }
    }
}
