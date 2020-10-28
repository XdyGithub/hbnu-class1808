package cn.hbnu.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 演示JDBC事务自动提交的方式
 *
 * @author 陈迪凯
 * @date 2020-10-28 10:53
 */
public class JdbcTest08 {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);

            String sql = "update userinfo set salary = ? where username = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, "900");
            ps.setString(2, "shinobu");
            int count = ps.executeUpdate();

            String str = null;
            str.length();

            ps.setString(1, "1000");
            ps.setString(2, "18411");
            count += ps.executeUpdate();

            System.out.println(count == 2 ? "修改成功" : "修改失败");
        } catch (Exception e) {
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
