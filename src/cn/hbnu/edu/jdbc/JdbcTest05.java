package cn.hbnu.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 模拟用户登录功能
 *
 * @author 陈迪凯
 * @date 2020-10-27 16:36
 */
public class JdbcTest05 {
    public static void main(String[] args) {
        // 1、提供给用户输入用户名和密码的入口
        Map<String, String> userInfo = initUI(); // 存储用户信息的集合

        // 2、校验用户名和密码
        boolean successLogin = login(userInfo);

        // 3、给用户登录成功或失败提示信息
        System.out.println(successLogin ? "登录成功" : "登录失败");
    }

    /**
     * 校验用户输入的账号和密码
     *
     * @param userInfo 用户信息
     * @return 校验成功或失败的结果
     */
    private static boolean login(Map<String, String> userInfo) {
        boolean flag = false; // flag表示用户验证成功或失败

        // 获取用户信息
        String name = userInfo.get("username");
        String pwd = userInfo.get("password");

        // 声明变量
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2、获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/hbnu?serverTimezone=GMT&useSSL=false&characterEncoding=utf-8";
            String user = "root";
            String password = "chendikai";
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stmt = conn.createStatement();

            // 4、执行SQL语句
            String sql = "select username,password,realname,salary from userinfo where username = '" + name + "' and password = '" + pwd + "'";
            rs = stmt.executeQuery(sql);

            // 5、处理查询结果集
            while (rs.next()) {
                flag = true;
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return flag;
    }

    /**
     * 用户输入账号和密码的入口
     *
     * @return 用户信息
     */
    private static Map<String, String> initUI() {
        Map<String, String> hashMap = new HashMap<>(); // hashMap用来存储用户信息

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入账号：");
        String username = scanner.nextLine();

        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        hashMap.put("username", username);
        hashMap.put("password", password);

        return hashMap;
    }
}
