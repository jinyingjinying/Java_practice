package Demo01.ExecutorTest;
// 创建线程池对象，包含2个线程。
// 从线程池中获取线程对象，然后调用MyRunnable中的run()
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new MyRunnableImpl());
    }
}
