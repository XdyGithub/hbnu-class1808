package cn.hbnu.edu.net;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 模拟用户登录——服务器端线程类
 *
 * @author 陈迪凯
 * @date 2020-11-12 8:20
 */
public class TcpServer08Thread implements Runnable {
    private Socket socket;

    public TcpServer08Thread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                // 3、获取流对象
                // socket输入流，用于接收客户端发送过来的数据
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // 文件输入流，用于获取用户列表
                BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\DingLi\\user.txt"));
                // socket输出流，用于返回结果给客户端
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                String username = in.readLine(); // 接收客户端发送过来的用户名
                if (username == null) {
                    break;
                }

                String line = null;
                boolean flag = false; // 用于记录用户登录成功或登录失败的标记
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.equals(username)) {
                       flag = true;
                        break;
                    }
                }

                bufferedReader.close();
                if (flag) {
                    System.out.println("欢迎用户【" + username + "】登录本系统");
                    out.println("欢迎用户【" + username + "】登录本系统");
                    break;
                } else {
                    System.out.println("用户【" + username + "】正在尝试登陆本系统");
                    out.println("用户【" + username + "】正在尝试登陆本系统");
                }

            }

            // 关闭资源
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
