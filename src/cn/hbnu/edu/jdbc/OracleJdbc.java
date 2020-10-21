package cn.hbnu.edu.jdbc;

/**
 * @author 陈迪凯
 * @date 2020-10-21 11:10
 */
public class OracleJdbc implements JdbcInterface {
    @Override
    public void getConnector() {
        System.out.println("成功连接Oracle数据库.....");
    }
}
