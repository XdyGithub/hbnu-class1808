package cn.hbnu.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-03 16:39
 */
public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(); // 创建线程对象， 此线程对象处于新建状态

        new Thread(ticket, "1号窗口").start();
        new Thread(ticket, "2号窗口").start();
        new Thread(ticket, "3号窗口").start();
    }
}
