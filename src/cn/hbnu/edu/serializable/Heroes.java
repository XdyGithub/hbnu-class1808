package cn.hbnu.edu.serializable;

import cn.hbnu.edu.common.DaJi;

import java.io.Serializable;

/**
 * @author 陈迪凯
 * @date 2020-10-20 16:28
 */
public class Heroes implements Serializable {
    private static final long serialVersionUID = 7294556731572370025L;

    private String name;
    private String role;

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
}
