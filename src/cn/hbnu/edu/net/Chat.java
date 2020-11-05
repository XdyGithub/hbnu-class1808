package cn.hbnu.edu.net;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author 陈迪凯
 * @date 2020-11-05 9:07
 */
public class Chat {
    public static void main(String[] args) {
        try {
            DatagramSocket sendSocket = new DatagramSocket();
            DatagramSocket receiveSocket = new DatagramSocket(6666);

            /*
            ChatSend chatSend = new ChatSend(sendSocket);
            ChatReceive chatReceive = new ChatReceive(receiveSocket);

            new Thread(chatSend).start();
            new Thread(chatReceive).start();
            */

            new Thread(new ChatSend(sendSocket)).start();
            new Thread(new ChatReceive(receiveSocket)).start();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
