package cn.hbnu.edu.classandobject;

public class Heroes {
    String name;
    double blood;
    static final double PI = 3.1415926;
    double speed = 6.28;

    public Heroes() {
        this("后羿", 100);
        System.out.println();
    }

    public Heroes(String name, double blood) {
        this.name = name;
        this.blood = blood;
    }

    public void move() {
        double speed = 3.14;
        System.out.println("英雄移动......" + this.speed);
    }

    public static void bloodReturning() {
        System.out.println("英雄回血......");
    }
}
