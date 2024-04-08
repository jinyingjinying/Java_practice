package Test;
/*创建多线程对象，开启多线程。
在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。*/
public class Test01MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println("子线程打印1-100的偶数：" + i);
            }
        }
    }
}
