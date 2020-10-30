package cn.hbnu.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-10-30 11:20
 */
public class NumberTest {
    public static void main(String[] args) {

        ThreadDemo04 threadDemo04 = new ThreadDemo04(); // 创建线程对象
        ThreadDemo05 threadDemo05 = new ThreadDemo05(); // 创建线程对象

        threadDemo04.start(); // 启动线程
        new Thread(threadDemo05).start(); // 启动线程

        /*
        new Thread(() -> {
            for (int i = 2; i <= 100; i+=2) {
                System.out.println(">>>>偶数：" + i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 1; i < 100; i+=2) {
                System.out.println("====奇数：" + i);
            }
        }).start();
        */
    }
}
