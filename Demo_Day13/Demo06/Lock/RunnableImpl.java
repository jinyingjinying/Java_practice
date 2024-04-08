package Demo06.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {

    //定义多个线程共享的票源
    private static int ticket = 100;

    Lock lock = new ReentrantLock();

    //run中调用
    @Override
    public void run() {
        while (true) {
            lock.lock();//上锁
            if (ticket > 0) {
                try {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();//释放锁
                }
            } else break;
            System.out.println("sold out");
        }
    }
}
