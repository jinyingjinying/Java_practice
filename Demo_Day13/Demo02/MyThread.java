package Demo02;

public class MyThread extends Thread{
    public MyThread() {
    }

    //有参构造
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //获取线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
