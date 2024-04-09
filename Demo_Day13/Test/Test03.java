package Test;

public class Test03 implements Runnable{
    int num = 10;
    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }
}
