package cn.hbnu.edu.classandobject;

public class Properties {

    public static int id = 12;

    public void changeId() {
        id *= 2;
        System.out.println(id);
    }

    public static void change() {
        System.out.println("this is a static method");
    }
}
