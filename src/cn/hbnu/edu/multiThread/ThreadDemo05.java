package cn.hbnu.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-10-30 11:19
 */
public class ThreadDemo05 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 100; i+=2) {
            System.out.println("====奇数：" + i);
        }
    }
}
