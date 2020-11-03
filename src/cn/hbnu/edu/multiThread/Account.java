package cn.hbnu.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-03 17:26
 */
public class Account implements Runnable {
    private int money;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            try {
                Thread.sleep((int)Math.random() * 1000);
                synchronized (this) {
                    money += 1000;
                    System.out.println(Thread.currentThread().getName() + "存入1000\n当前余额>>>>:" + money);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
