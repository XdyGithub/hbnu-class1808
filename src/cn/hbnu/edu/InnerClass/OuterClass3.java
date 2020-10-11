package cn.hbnu.edu.InnerClass;

public class OuterClass3 {
    public static void main(String[] args) {
        callInner(new AbstractTest() {
            @Override
            public void method() {
                System.out.println("****************");
            }
        });
    }

    public static void callInner(AbstractTest abstractTest) {
        abstractTest.method();
    }
}
