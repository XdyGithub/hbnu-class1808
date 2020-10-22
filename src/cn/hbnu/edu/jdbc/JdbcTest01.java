package cn.hbnu.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 注册驱动、获取连接
 *
 * @author 陈迪凯
 * @date 2020-10-22 8:03
 */
public class JdbcTest01 {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        try {
            // 1、注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 2、获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/hbnu?useSSL=false&serverTimezone=GMT&characterEncoding=utf-8"; // 协议：//ip:端口/数据库名
            String user = "root"; // hbnujixin
            String password = "chendikai"; // 123456
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stmt = conn.createStatement();

            // 4、执行sql语句
            String sql = "insert into userinfo(username, password, realname, salary) values('jixin1808','1808','计信1808班',80000)";
            int count = stmt.executeUpdate(sql); // 对于增、删、改这三种操作，调用的是executeUpdate()方法
            System.out.println("影响的数据：" + count);

            // 5、处理查询结果集
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
    }
}
