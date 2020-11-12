package cn.hbnu.edu.net;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 图片并发上传客户端
 *
 * @author 陈迪凯
 * @date 2020-11-11 10:15
 */
public class TcpClient07 {
    public static void main(String[] args) {
        try {

            if (args.length != 1) {
                System.out.println("请上传.jpg格式的图片");
                return;
            }

            File file = new File(args[0]);

            if (!(file.exists() && file.isFile())) {
                System.out.println("你小子有问题，文件不存在，或者不是文件");
                return;
            }

            if (!(file.getName().endsWith(".jpg"))) {
                System.out.println("图片格式错误，请上传.jpg格式的图片");
                return;
            }

            if (file.length() > 1024 * 1024 * 5) {
                System.out.println("图片过大，没安好心");
                return;
            }

            // 1、创建socket服务，指定服务器端的ip和端口port
            Socket socket = new Socket("127.0.0.1", 6666);

            // 2、获取流对象
            // 文件输入流，用于获取文件内容
            FileInputStream fis = new FileInputStream(file);
            // socket输出流，用于向服务器端发送数据
            OutputStream out = socket.getOutputStream();
            // socket输入流，用于获取服务端返回的结果
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 3、读图片内容，并将内容发送给服务器端
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = fis.read(buf)) != -1) {
                // 4、将读到的图片内容发送给服务器端
                out.write(buf, 0, len);
            }

            socket.shutdownOutput();

            // 5、接收服务器端返回结果
            String result = in.readLine();
            System.out.println(result);

            // 6、关闭资源
            fis.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
