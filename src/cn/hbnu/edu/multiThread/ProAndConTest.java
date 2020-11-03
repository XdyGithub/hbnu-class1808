package cn.hbnu.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-03 17:51
 */
public class ProAndConTest {
    public static void main(String[] args) {
        Box box = new Box();

        new Thread(new Productor(box)).start();
        new Thread(new Consumer(box)).start();
    }
}
