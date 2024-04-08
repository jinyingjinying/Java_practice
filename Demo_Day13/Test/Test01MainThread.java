package Test;

import Demo01.MyThread;

/*创建多线程对象，开启多线程。
在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。*/
public class Test01MainThread {
    public static void main(String[] args) {
        Test01MyThread mt1 = new Test01MyThread();
        mt1.start();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 ==1 ) {
                System.out.println("主线程打印1-100的奇数：" + i);
            }
        }
    }
}
