package cn.hbnu.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-03 17:50
 */
public class Consumer implements Runnable {
    private Box box;

    public Consumer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) Math.random() * 1000);
                box.getProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
