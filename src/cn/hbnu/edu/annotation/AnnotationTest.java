package cn.hbnu.edu.annotation;

/**
 * 注解测试类
 *
 * @author 陈迪凯
 * @date 2020-10-20 16:55
 */
@MyAnnotation(name = "jixin")
public class AnnotationTest {
    private String name;

    @SuppressWarnings("")
    public static void main(String[] args) {
        test();
    }

    @Deprecated
    public static void test() {
        System.out.println("Deprecated。。。。");
    }

    @MyAnnotation(name = "jixin")
    public static void test2() {

    }

    @Override
    public String toString() {
        return "AnnotationTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
