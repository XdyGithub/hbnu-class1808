package cn.hbnu.edu.reflect;

/**
 * @author 陈迪凯
 * @date 2020-10-20 17:28
 */
public class HouYi extends Heroes {
    private String blood;
    public int roleId;

    public HouYi() {
        super();
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public HouYi(String name, String role, String blood, int roleId) {
        super(name, role);
        this.blood = blood;
        this.roleId = roleId;
    }

    public HouYi(String name, String role) {
        super(name, role);
    }

    public void houYi1() {
        System.out.println("houyi'public method");
    }

    private void houYi2() {
        System.out.println("houyi'private method");
    }

    public void houYi3(String name) {
        System.out.println("houYi3'public method with a parameter" + name);

    }
}
