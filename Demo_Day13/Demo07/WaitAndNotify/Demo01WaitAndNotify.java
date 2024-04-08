package Demo07.WaitAndNotify;

/*
    等待唤醒案例：线程之间的通信
        创建一个顾客线程：告知老板要的包子种类和数量，调用wait方法，放弃cpu执行，进入到WAITING状态
        创建一个老板线程：花了5s做包子，做好之后调用notify方法，唤醒顾客吃包子
    注意事项：
        1. 顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
        2. 同步使用的锁对象必须保证是唯一的
        3. 只有锁对象才能调用wait和notify方法
    Objects类中的方法：
        void wait(): 当前线程等待
        void notify(): 唤醒等待的单个线程，继续执行wait之后的代码
*/

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread() {
            public void run() {
                synchronized (obj) {
                    System.out.println("告知老板我要的包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("包子做好了，开吃");
                }
            }
        }.start();

        new Thread() {
            public void run() {
                //花5秒做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (obj) {
                    System.out.println("5秒钟到了，请提醒顾客");
                    obj.notify();
                }
            }
        }.start();
    }
}
