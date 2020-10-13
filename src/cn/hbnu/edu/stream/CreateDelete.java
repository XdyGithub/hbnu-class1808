package cn.hbnu.edu.stream;

import java.io.File;
import java.io.IOException;

public class CreateDelete {

    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1808.txt";

        File file = new File(fileName);

        if (file.exists()) {
            file.delete();
            System.out.println("删除文件......");
        } else {
            try {
                file.createNewFile();
                System.out.println("创建文件......");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
