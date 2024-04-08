package Demo05_02;

public class RunnableImpl implements Runnable{

    //定义多个线程共享的票源
    private int ticket = 100;

    //run中调用
    @Override
    public void run() {
        while(true) {
           payTicket();
        }
    }


    // 相当于synchronized (this)
/*
    public void payTicket() {
        synchronized (this) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
*/
    // 构造同步方法
    public synchronized void payTicket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}
