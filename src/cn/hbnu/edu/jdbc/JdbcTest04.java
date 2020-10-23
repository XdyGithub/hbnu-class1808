package cn.hbnu.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * 查询数据库，查询结果集的处理
 *
 * @author 陈迪凯
 * @date 2020-10-23 10:53
 */
public class JdbcTest04 {
    public static void main(String[] args) {
        // 获取配置文件数据
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        // 变量声明
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动
            Class.forName(driver);

            // 2、获取连接
            conn = DriverManager.getConnection(url, user, password);

            // 3、获取数据库操作对象
            stmt = conn.createStatement();

            // 4、执行Sql语句
            String sql = "select username as name,password,realname,salary from userinfo";
            rs = stmt.executeQuery(sql); // 查询操作使用executeQuery()方法

            // 5、处理查询结果集
            while (rs.next()) {
                /*
                // 5.1 根据下标，字符串方法获取数据，
                String name = rs.getString(1);
                String pwd = rs.getString(2);
                String real = rs.getString(3);
                String sal = rs.getString(4);
                */

                /*
                // 5.2 根据下标和指定数据类型获取
                String name = rs.getString(1);
                String pwd = rs.getString(2);
                String real = rs.getString(3);
                double sal = rs.getDouble(4);
                */

                /*
                // 5.3 根据字段名和字符串获取数据
                String name = rs.getString("name");
                String pwd = rs.getString("password");
                String real = rs.getString("realname");
                String sal = rs.getString("salary");
                */

                // 5.4 根据查询结果的字段名和指定数据类型获取
                String name = rs.getString("name"); // 字段名为查询结果的字段名，不是数据库中的字段名
                String pwd = rs.getString("password");
                String real = rs.getString("realname");
                double sal = rs.getDouble("salary");

                System.out.println(name + "\t" + pwd + "\t" + real + "\t" + sal);
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
    }
}
