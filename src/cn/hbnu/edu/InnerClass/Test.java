package cn.hbnu.edu.InnerClass;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer(); // 创建外部类对象
        Outer.Inner inner = outer.new Inner(); // 创建内部类对象
        inner.innerMethod(333);

        Outer.Inner inner1 = new Outer().new Inner(); // 成员内部类创建内部类对象
        OuterClass2.Inner3 inner3 = new OuterClass2.Inner3(); // 嵌套类创建对象
    }
}
