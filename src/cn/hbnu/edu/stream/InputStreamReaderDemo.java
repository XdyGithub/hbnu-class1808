package cn.hbnu.edu.stream;

import java.io.*;

/**
 * 字节输入流转字符输入流
 */
public class InputStreamReaderDemo {

    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1808.txt";

        File file = new File(fileName);

        InputStreamReader inputStreamReader = null;

        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file));

            char[] chars = new char[1024];

            int length = inputStreamReader.read(chars);

            System.out.println(new String(chars, 0, length));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
