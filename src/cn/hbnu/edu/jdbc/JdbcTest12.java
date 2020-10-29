package cn.hbnu.edu.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 演示悲观锁
 *
 * @author 陈迪凯
 * @date 2020-10-29 9:02
 */
public class JdbcTest12 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动和获取连接
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false); // 开启事务

            // 3、获取数据库操作对象
            String sql = "update userinfo set salary = ? where username = ?";
            ps = conn.prepareStatement(sql);

            // 4、执行SQL语句
            ps.setString(1, "200");
            ps.setString(2, "1");
            int count = ps.executeUpdate();
            System.out.println(count);

            // 5、处理查询及结果集
            conn.commit(); // 提交事务
        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback(); // 回滚事务
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, ps, conn);
        }
    }
}
