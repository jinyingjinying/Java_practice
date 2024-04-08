package Demo02;

public class Demo02Sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println(i+1);

            //使用sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
