package Test;

public class Test02Thread {
    public static void main(String[] args) {
        method01();
        System.out.println("-----------------------");
        method02();

    }

    private static void method02() {
        System.out.println("main:" + Thread.currentThread().getName());
        Test02RunnableImpl runnable = new Test02RunnableImpl();
        new Thread(runnable).start();
        //main:main
        //subrunnable:Thread-0
    }

    private static void method01() {
        System.out.println("main:" + Thread.currentThread().getName());
        Test02SubThread subthread = new Test02SubThread();
        subthread.start();
        //main:main
        //subthread:Thread-0
    }
}
