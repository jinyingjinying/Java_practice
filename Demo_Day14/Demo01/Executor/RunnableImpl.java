package Demo01.Executor;

public class RunnableImpl implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
    }
}
