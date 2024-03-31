package Demo03;

/*
* Calendar类是一个抽象类
* 无法直接创建对象使用
* 静态方法 getInstance()
* */

import java.util.Calendar;

public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
