package Demo07.WaitAndNotify;


public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            public void run() {
                synchronized (obj) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        try {
                            obj.wait(5000); //相当于sleep
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("包子做好了，顾客1开吃");
                        System.out.println("---------------------");
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                synchronized (obj) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        try {
                            obj.wait(5000); //相当于sleep
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("包子做好了，顾客2开吃");
                        System.out.println("---------------------");
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (obj) {
                        System.out.println("5秒钟到了，请提醒顾客");
                        obj.notifyAll();        //唤醒多个线程,唤醒不是执行
                    }
                }
            }
        }.start();
    }
}
