package Demo02;

import Demo02.MyThread;

public class Demo01SetThreadName {
    public static void main(String[] args) {

        MyThread mt1 = new MyThread();
        mt1.setName("拉拉线程");
        mt1.start();                // Thread-0 新设置的线程名称

        new MyThread("包包线程").start();// 包包线程
    }
}
