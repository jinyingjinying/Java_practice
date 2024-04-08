package Demo05_03;

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();      //共享票源
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
