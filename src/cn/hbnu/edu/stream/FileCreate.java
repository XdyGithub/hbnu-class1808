package cn.hbnu.edu.stream;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "DingLi" + File.separator + "jixin1808.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("文件创建成功......");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
