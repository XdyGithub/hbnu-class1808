package cn.hbnu.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-03 17:43
 */
public class Box {
    private int product; // 共享数据

    public synchronized void addProduct() {
        if (product >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            product++;
            System.out.println("生产者生产了::" + product + "号商品");
            notifyAll();
        }
    }

    public synchronized void getProduct() {
        if (product <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("消费者消费了>>>>" + product + "号商品");
            product--;
            notifyAll();
        }
    }
}
