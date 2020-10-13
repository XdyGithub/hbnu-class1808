package cn.hbnu.edu.stream;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1808.txt";
        File file = new File(fileName);

        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(file, true);

            String str = "\r\n班级总人数：64人";
            byte[] bytes = str.getBytes();

            // outputStream.write(bytes);
            for (int i = 0; i < bytes.length; i++) {
                outputStream.write(bytes[i]);
            }

            System.out.println("写文件成功......");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
