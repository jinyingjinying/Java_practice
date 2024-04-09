package Demo07.WaitAndNotify;

public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    public void run() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            synchronized (bz) {     //两个线程共享的对象只有BaoZi
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("包子铺开始做包子……");
                if (count % 2 == 0) {
                    bz.pier = "冰皮";
                    bz.xianer = "五仁";
                } else {
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }
                count++;
                bz.flag = true;
                System.out.println(bz.pier + bz.xianer + "的包子做好啦！");
                System.out.println("吃货来吃吧！");
                bz.notify();
            }
        }
    }
}
