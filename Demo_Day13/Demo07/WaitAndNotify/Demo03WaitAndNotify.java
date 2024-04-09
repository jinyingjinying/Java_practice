package Demo07.WaitAndNotify;

public class Demo03WaitAndNotify {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();         //只有一个包子 所以共享资源，跟线程里的定义没有关系
        ChiHuo ch = new ChiHuo("吃货",bz);
        BaoZiPu bzp = new BaoZiPu("包子铺", bz);

        ch.start();
        bzp.start();
    }
}
