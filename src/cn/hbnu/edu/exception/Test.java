package cn.hbnu.edu.exception;

public class Test {
    public static void main(String[] args) {
        try {
            // code

            throw new DefineException("自定义异常");
        } catch (DefineException e) {
            System.out.println("处理自定义异常......");
            e.printStackTrace();
        }
    }
}
