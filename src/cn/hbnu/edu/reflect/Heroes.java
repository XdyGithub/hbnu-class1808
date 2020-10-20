package cn.hbnu.edu.reflect;

/**
 * @author 陈迪凯
 * @date 2020-10-20 17:27
 */
public class Heroes {
    private String name;
    public String role;

    public Heroes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Heroes(String name, String role) {
        this.name = name;
        this.role = role;
    }

    private void test() {
        System.out.println("heroes'private method");
    }

    public void test2() {
        System.out.println("heroes'public method");
    }
}
