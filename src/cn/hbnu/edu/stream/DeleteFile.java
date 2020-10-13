package cn.hbnu.edu.stream;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1808.txt";

        File file = new File(fileName);

        if (file.exists()) {
            file.delete();
            System.out.println("删除文件......");
        } else {
            System.out.println("文件不存在......");
        }
    }
}
