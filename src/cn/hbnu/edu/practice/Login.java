package cn.hbnu.edu.practice;

import java.util.Scanner;

public class Login {
    private static final int COUNT = 3; // 用户输入用户名和密码次数限制
    public static void main(String[] args) {
        User user = new User("hbnu1808", "jixin1808"); // 真实的用户名和密码

        int count = 0; // 记录用户输入的次数
        while (count < COUNT) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = scanner.next(); // 接收用户输入的用户名

            System.out.println("请输入密码：");
            String password = scanner.next(); // 接收用户输入的密码

            User user1 = new User(username, password);
            if (user1.equals(user)) {
                System.out.println("欢迎用户" + username + "成功登陆本系统！！！！");
                break;
            }
            count++;

        }
        if (count == 3) {
            System.out.println("你登陆的次数过多，请稍后再登，或者联系管理员......");
        }

    }
}
