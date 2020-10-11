package cn.hbnu.edu.InnerClass;

public class OuterClass2 {
    // 属性
    private static int id = 2;

    // 行为
    public void method() {
        // 局部内部类
        class Inner {

        }
    }

    {
        // 局部内部类
        class Inner1 {

        }
    }

    // 成员内部类(静态成员内部类，也叫嵌套类)
    public static class Inner3 {
        private int roleId = 25;
        private static int stuId = 45;
         public void method() {
             System.out.println(id);
         }
    }
}
