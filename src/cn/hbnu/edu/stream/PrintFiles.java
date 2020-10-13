package cn.hbnu.edu.stream;

import java.io.File;

public class PrintFiles {
    public static void main(String[] args) {
        String filePath = "E:" + File.separator + "DingLi";
        File file = new File(filePath);
        printFiles(file);
    }

    private static void printFiles(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File[] files = file.listFiles(); // 获取当前目录下的所有文件
                for (File f : files) {
                    printFiles(f);
                }
            } else {
                if (file.getAbsolutePath().endsWith(".java")) {
                    System.out.println(file);
                }
            }
        }
    }
}
