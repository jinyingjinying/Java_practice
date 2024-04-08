package Demo05_03;

public class RunnableImpl implements Runnable{

    //定义多个线程共享的票源
    private static int ticket = 100;

    //run中调用
    @Override
    public void run() {
        while(true) {
           payTicketStatic();
        }
    }

    //相当于synchronized(RunnableImpl.class)
/*
    public static void payTicketStatic() {
        synchronized (RunnableImpl.class) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
*/

    public static synchronized void payTicketStatic() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}
