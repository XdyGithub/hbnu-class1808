package cn.hbnu.edu.jdbc;

import java.util.ResourceBundle;

/**
 * @author 陈迪凯
 * @date 2020-10-21 11:10
 */
public class JavaProgrammer {
    public static void main(String[] args) throws Exception {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");
//        JdbcInterface jdbcInterface = new MysqlJdbc();
        Class clazz = Class.forName(driver);
        JdbcInterface jdbcInterface = (JdbcInterface) clazz.newInstance();
        jdbcInterface.getConnector();
    }
}
