package cn.hbnu.edu.summary;

public class Student extends Person implements Language, Basketball {
    public void study() {
        System.out.println("努力学习！！！");
    }

    public void eat() {
        System.out.println("学生吃东西......");
    }

    @Override
    public void speckEnglish() {
        System.out.println("学生也会说英语......");
    }

    @Override
    public void playBasketball() {
        System.out.println("学生打篮球......");
    }
}
