package cn.hbnu.edu.multiThread;

/**
 * 生产者
 *
 * @author 陈迪凯
 * @date 2020-11-03 17:48
 */
public class Productor implements Runnable {
    private Box box;

    public Productor(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) Math.random() * 1000);
                box.addProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
