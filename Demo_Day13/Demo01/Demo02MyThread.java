package Demo01;

/*
创建多线程程序方法1：创建Thread类的子类
    1. 创建Thread类的子类
    2. 重写run方法，设置线程任务
    3. 创建Thread类的子类对象
    4. 调用start方法，开启新线程，执行run方法
       结果是两个线程并发运行；当前线程(main)和另一个线程(创建的新线程执行其run方法)
* */

public class Demo02MyThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();     //创建Thread类的子类对象
        myThread.start();                       //调用start方法开启新线程，执行其中的run方法

/*
        for (int i = 0; i < 20; i++) {
            System.out.print("main:" + i + "; ");
        }
*/
        new MyThread().start();     //创建Thread类的子类对象  Thread[#24,Thread-2,5,main]
        new MyThread().start();     //创建Thread类的子类对象  Thread[#23,Thread-1,5,main]
        new MyThread().start();     //创建Thread类的子类对象  Thread[#25,Thread-3,5,main]
        System.out.println(Thread.currentThread().getName());       //main

    }
}
