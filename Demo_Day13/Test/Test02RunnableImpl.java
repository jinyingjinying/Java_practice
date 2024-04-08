package Test;

public class Test02RunnableImpl implements Runnable {
    public void run() {
        System.out.println("subrunnable:" + Thread.currentThread().getName());
    }
}
