package thread;

import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class callableAndRunnable {
    public static void main(String[] args) throws Exception{
        Thread thread01 = new Thread(() -> {
            System.out.println("运行runnable实现的线程");
        });
        thread01.start();

        FutureTask<Integer> task = new FutureTask<>(() -> {
            Thread.sleep(3000);
            System.out.println("运行callable1实现的线程");
            throw new RuntimeException("callable异常");
        });
        Thread thread02 = new Thread(task);
        thread02.start();
        while(!task.isDone()){
            System.out.println("等待");
            Thread.sleep(2000);
        }
        System.out.println("callable运行结束，结果：" + task.get());

    }
}


