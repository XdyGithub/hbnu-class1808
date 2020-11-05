package cn.hbnu.edu.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 从键盘输入数据，发送到接收端
 *
 * @author 陈迪凯
 * @date 2020-11-05 8:13
 */
public class UdpSend02 {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            // 1、定义UDP Socket服务
            datagramSocket = new DatagramSocket();

            // 2、从键盘输入需要发送给接收端的数据
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                // byte[] buf = line.getBytes();
                // 3、将数据封装到数据报包中
                DatagramPacket datagramPacket = new DatagramPacket(line.getBytes(), line.getBytes().length,
                        InetAddress.getByName("127.0.0.1"), 8888);

                // 4、发送数据
                datagramSocket.send(datagramPacket);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5、关闭资源
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }
    }
}
