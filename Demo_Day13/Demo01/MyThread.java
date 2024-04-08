package Demo01;

public class MyThread extends Thread{
    @Override
    public void run() {     //重写类中的run方法，设置线程任务
/*
        String name = getName();
        System.out.println(name);
*/

/*
        Thread thread = Thread.currentThread();
        System.out.println(thread);
*/
        System.out.println(Thread.currentThread().getName());
/*
        for (int i = 0; i < 20; i++) {
            System.out.print("run:" + i + "; ");
        }
*/
    }
}
