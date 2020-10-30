package cn.hbnu.edu.multiThread;

import java.util.concurrent.Callable;

/**
 * 线程实现方式三：实现Callable接口
 *
 * @author 陈迪凯
 * @date 2020-10-30 10:54
 */
public class ThreadDemo03 implements Callable<String> {
    @Override
    public String call() throws Exception {

        for (int i = 0; i < 1000; i++) {
            System.out.println(">>>>子线程执行：" + i);
        }

        return "子线程结束";
    }
}
