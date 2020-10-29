package cn.hbnu.edu.jdbc;

import cn.hbnu.edu.practice.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 查询数据，封装到实体类中。并放入集合中存储
 *
 * @author 陈迪凯
 * @date 2020-10-29 9:12
 */
public class JdbcTest13 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1、注册驱动和获取连接
            conn = JDBCUtils.getConnection();

            // 3、获取数据库操作对象
            String sql = "select id, stuNo, name, sex, colleage, profession, class from student where stuNo like ?";
            ps = conn.prepareStatement(sql);

            // 4、执行SQL语句
            ps.setString(1, "%08__");
            rs = ps.executeQuery();

            List<Student> list = new ArrayList<>();
            // 5、处理查询结果集
            while (rs.next()) {
                Student student = new Student();

                student.setId(rs.getInt("id"));
                student.setStuNo(rs.getString("stuNo"));
                student.setName(rs.getString("name"));
                student.setSex(rs.getString("sex"));
                student.setColleage(rs.getString("colleage"));
                student.setProfession(rs.getString("profession"));

                list.add(student);

            }

            Iterator<Student> iterator = list.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();

                System.out.println(student.getName() + "\t\t" + student.getStuNo());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            JDBCUtils.close(rs, ps, conn);
        }
    }
}
