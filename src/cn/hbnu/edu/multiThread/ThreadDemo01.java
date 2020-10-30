package cn.hbnu.edu.multiThread;

/**
 * 线程实现方式一：继承Thread类
 *
 * @author 陈迪凯
 * @date 2020-10-30 10:25
 */
public class ThreadDemo01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(">>>>子线程执行：" + i);
        }
    }
}
