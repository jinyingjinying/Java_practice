package Test;

public class Test02SubThread extends Thread{
    public void run() {
        System.out.println("subthread:" + Thread.currentThread().getName());
    }
}
