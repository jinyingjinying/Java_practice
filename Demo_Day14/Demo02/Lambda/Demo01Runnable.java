package Demo02.Lambda;

// 使用实现Runnable接口的方式实现多线程程序


public class Demo01Runnable {
    public static void main(String[] args) {
/*
        RunnableImpl run = new RunnableImpl();
        Thread t1 = new Thread(run);
        t1.start();
*/
        Runnable run = new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
            }
        };
        new Thread(run).start();
    }
}
