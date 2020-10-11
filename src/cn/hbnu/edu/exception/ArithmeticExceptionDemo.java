package cn.hbnu.edu.exception;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        divice(4, 0);
    }

    private static void divice(int i, int i1) {
        if (i1 == 0) {
            throw new ArithmeticException("不能被0整除");
        }
        System.out.println(i / i1);
    }
}
