package Demo07.WaitAndNotify;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("吃货正在吃" + bz.pier + bz.xianer + "的包子……");
                System.out.println("--------------------");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
