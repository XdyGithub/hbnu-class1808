package cn.hbnu.edu.stream;

import java.io.*;

/**
 * 字符输出流转字节输出流
 */
public class OutputStreamWriterDemo {

    public static void main(String[] args) {

        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1808.txt";

        File file = new File(fileName);

        // 声明流引用
        OutputStreamWriter outputStreamWriter = null;

        try {
            // 创建outputStreamWriter对象，构造方法的参数为字节输出流对象
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));

            String str = "湖北师范大学";

            outputStreamWriter.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
