package Demo07;

import red.OpenMode;

public class Bootstrap {
    // RedPacketFrame 父类 前端可视化
    // MyRed 子类

    public static void main(String[] args) {

        //程序的标题，通过构造方法的字符串参数
        MyRed red = new MyRed("jy的小红包");

        //群主名称
        red.setOwnerName("王思聪");

        //创建方式：普通红包
        OpenMode normal = new NormalMode();
        OpenMode random = new RandomMode();

/*
        red.setOpenWay(normal);
*/
        red.setOpenWay(random);
    }
}
