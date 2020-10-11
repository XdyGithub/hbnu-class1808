package cn.hbnu.edu.summary;

public class Teacher extends Person implements Language, Basketball {
    public void teach() {
        System.out.println("教书育人......");
    }

    public void eat() {
        System.out.println("老师吃东西......");
    }

    @Override
    public void speckEnglish() {
        System.out.println("老师居然会说英语......");
    }

    @Override
    public void playBasketball() {
        System.out.println("老师打篮球......");
    }
}
