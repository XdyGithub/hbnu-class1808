package cn.hbnu.edu.exception;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        String[] str = {"test1", "test2", "test3"};
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(str[i]);
            }
            return;

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(); // 打印异常信息到控制台上
            System.out.println("发生了异常");
        } finally {
            System.out.println("finally......");
        }
    }
}
