package cn.hbnu.edu.multiThread;

import java.awt.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈迪凯
 * @date 2020-11-03 16:36
 */
public class Ticket implements Runnable {
    private int ticket = 20; // 共享数据

    private final ReentrantLock lock = new ReentrantLock(); // 创建锁对象

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((int)Math.random() * 1000);

                lock.lock(); // 加锁
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了" + ticket + "号票");
                    ticket--;
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock(); // 释放锁
            }

            /*
            // synchronized加锁和释放锁
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了" + ticket + "号票");
                    ticket--;
                } else {
                    break;
                }
            }
            */
        }
    }
}
