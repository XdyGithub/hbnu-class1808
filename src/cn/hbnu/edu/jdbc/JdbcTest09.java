package cn.hbnu.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 银行转账演示
 *
 * @author 陈迪凯
 * @date 2020-10-28 11:01
 */
public class JdbcTest09 {
    public static void main(String[] args) {
        // 从配置文件获取数据库信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        // 声明变量
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // 1、注册驱动
            Class.forName(driver);

            // 2、获取连接
            conn = DriverManager.getConnection(url, user, password);

            conn.setAutoCommit(false); // 开启事务

            // 3、获取数据库操作对象
            String sql = "update userinfo set salary = ? where username = ?";
            ps = conn.prepareStatement(sql);

            // 4、执行SQL语句
            ps.setDouble(1, 1000);
            ps.setString(2, "shinobu");
            int count = ps.executeUpdate();

            String str = null;
            str.length();

            ps.setDouble(1, 1000);
            ps.setString(2, "cxk");
            count += ps.executeUpdate();

            //5、处理查询结果集

            conn.commit(); // 提交事务
        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback(); // 事务回滚
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // 6、释放资源
            try {
                if (ps != null) {
                    ps.close();
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
