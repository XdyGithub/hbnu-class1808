package cn.hbnu.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-03 17:28
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        new Thread(account, "A储户").start();
        new Thread(account, "B储户").start();
    }
}
