package cn.hbnu.edu.summary;

/**
 * 封装一个人类
 */
public abstract class Person {
    private String name; // 姓名
    private int age; // 年龄

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

}
