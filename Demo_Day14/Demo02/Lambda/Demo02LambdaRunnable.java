package Demo02.Lambda;

public class Demo02LambdaRunnable {
    public static void main(String[] args) {
        //标准格式
        new Thread(() -> {
            System.out.println("多线程任务执行！");
        }).start();

        //省略格式，{}, return, ;都省略了
        new Thread( () -> System.out.println("多线程任务执行！") ).start();

        // 向 new Thread().start(); 中传递
        // () -> System.out.println("多线程任务执行！")
    }
}
