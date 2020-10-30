package cn.hbnu.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-10-30 11:17
 */
public class ThreadDemo04 extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(">>>>偶数：" + i);
        }
    }
}
