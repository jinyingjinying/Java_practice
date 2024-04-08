package Demo04;

public class RunnableImpl implements Runnable{

    //定义多个线程共享的票源
    private int ticket = 100;

    @Override
    public void run() {
        while(true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                ticket--;
            } else break;
        }
    }
}
