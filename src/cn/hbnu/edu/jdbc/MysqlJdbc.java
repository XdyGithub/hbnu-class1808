package cn.hbnu.edu.jdbc;

/**
 * @author 陈迪凯
 * @date 2020-10-21 11:09
 */
public class MysqlJdbc implements JdbcInterface {

    @Override
    public void getConnector() {
        System.out.println("成功连接mysql数据库.....");
    }
}
