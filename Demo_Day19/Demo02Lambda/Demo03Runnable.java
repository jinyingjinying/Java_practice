package Demo02Lambda;

/*
    如果方法的参数是一个函数式接口类型，那么就可以使用Lambda表达式进行替代。
    使用Lambda表达式作为方法参数，其实就是使用函数式接口作为方法参数。
    假设有一个 startThread 方法使用函数式接口Runnable接口作为参数，那么就可以使用Lambda进行传参。
    这种情况其实和 Thread 类的构造方法参数为 Runnable 没有本质区别。
 */

import java.sql.SQLOutput;

public class Demo03Runnable {
    // 传递的参数是函数式表达式
    public static void startThread(Runnable run) {
        // 开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        // 调用startThread，方法的参数是函数式接口，可以传递接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                // 打印线程名称
                System.out.println(Thread.currentThread().getName()+"--->线程启动了");
            }
        });

        // 调用startThread，方法的参数是函数式接口，可以传递Lambda表达式
        startThread( () -> {
            System.out.println(Thread.currentThread().getName()+"--->线程启动了");
        });
    }
}
