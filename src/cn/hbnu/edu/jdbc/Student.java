package cn.hbnu.edu.jdbc;

/**
 * 学生类
 *
 * @author 陈迪凯
 * @date 2020-10-29 9:10
 */
public class Student {
    private int id; // 学生id
    private String stuNo; // 学号
    private String name; // 姓名
    private String sex; // 性别
    private String colleage; // 学院
    private String profession; // 专业
    private String clazz; // 班级

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColleage() {
        return colleage;
    }

    public void setColleage(String colleage) {
        this.colleage = colleage;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
