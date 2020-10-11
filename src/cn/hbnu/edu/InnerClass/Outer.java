package cn.hbnu.edu.InnerClass;

public class Outer {
    // 属性
    private int id = 100;

    // 方法
    public String method1() {
        return "外部类方法一";
    }

    public class Inner {
        // 属性
        public String name = "1808";
        int id  = 200;

        // 方法
        public void innerMethod(int id) {
            System.out.println(id); // 访问局部变量
            System.out.println(this.id); // 访问内部类实例变量
            System.out.println(Outer.this.id); // 访问外部类实例变量

            System.out.println(method1());
            System.out.println(Outer.this.method1());

        }

        public String method2() {
            return "内部类方法二";
        }

        public String method1() {
            return "内部类方法一";
        }
    }
}
