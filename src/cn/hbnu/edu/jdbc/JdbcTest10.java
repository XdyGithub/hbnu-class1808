package cn.hbnu.edu.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 使用自己封装的JDBC工具类进行模糊查询
 *
 * @author 陈迪凯
 * @date 2020-10-29 8:11
 */
public class JdbcTest10 {

    public static void main(String[] args) {

        // 声明变量
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动和获取连接
            conn = JDBCUtils.getConnection(); // 从配置文件获取数据库信息、注册驱动、获取数据库连接

            // 3、获取数据库操作对象
            String sql = "select stuNo, name, sex from student where stuNo like ?";
            ps = conn.prepareStatement(sql);

            // 4、执行SQL语句
            ps.setString(1,"%08__");
            rs = ps.executeQuery();

            // 5、处理查询结果集
            while (rs.next()) {
                System.out.println(rs.getString("stuNo") + "\t\t" + rs.getString("name") + "\t\t" + rs.getString("sex"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            JDBCUtils.close(rs, ps, conn);
        }

    }
}
