package Demo02.Lambda;

public class RunnableImpl implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
    }
}
