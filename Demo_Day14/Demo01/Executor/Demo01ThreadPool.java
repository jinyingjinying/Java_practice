package Demo01.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    java.util.concurrent.Executors：线程池的工具类
    java.util.concurrent.ExecutorService: 线程池接口

    使用线程池中线程对象的步骤：
        1. 创建线程池对象。newFixedThreadPool
        2. 创建Runnable接口子类对象: 实现Runnable接口，重写run方法，设置线程任务
        3. 提交Runnable接口子类对象: 调用submit方法，传递线程任务（实现类），开启线程执行run方法
        4. 关闭线程池(一般不做)。shutdown();
*/
public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());  //pool-1-thread-1创建了一个新的线程
        es.submit(new RunnableImpl());  //pool-1-thread-1创建了一个新的线程
        es.submit(new RunnableImpl());  //pool-1-thread-2创建了一个新的线程
        es.shutdown();                  //线程池都没有了
    }
}
