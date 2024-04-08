package Demo05_01;

public class RunnableImpl implements Runnable{

    //定义多个线程共享的票源
    private int ticket = 100;

    // 创建锁对象必须要在run方法的外面
    Object obj = new Object();

    @Override
    public void run() {
        while(true) {
            synchronized (obj) {        //上锁
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                    ticket--;
                } else break;
            }
        }
    }
}
