package Demo03;

import Demo01.MyThread;

public class Demo01Runnable {
    public static void main(String[] args) {

        //匿名内部类
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + "thread匿名内部类");
                }
            }
        }.start();

        //
        Runnable r =new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + "runnable匿名内部类");
                }
            }
        };
        new Thread(r).start();

/*
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();
*/

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + "主接口");
        }
    }
}
