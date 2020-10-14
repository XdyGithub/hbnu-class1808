package cn.hbnu.edu.stream;

import java.io.IOException;

public class PipedStreamDemo {
    public static void main(String[] args) {
        PipedOutputStreamDemo pipedOutputStreamDemo = new PipedOutputStreamDemo();
        PipedInputStreamDemo pipedInputStreamDemo = new PipedInputStreamDemo();

        try {
            // 将管道输出流和管道输入流进行连接
            pipedOutputStreamDemo.getPipedOutputStream().connect(pipedInputStreamDemo.getPipedInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 启动线程
        new Thread(pipedOutputStreamDemo).start();
        new Thread(pipedInputStreamDemo).start();
    }
}
