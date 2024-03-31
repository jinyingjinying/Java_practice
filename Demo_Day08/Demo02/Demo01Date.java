package Demo02;

import java.util.Date;

public class Demo01Date {

    public static void main(String[] args) {
        methodMills();
        methodMills2();
        methodDate();
    }

    public static void methodMills() {
        System.out.println(System.currentTimeMillis()); // 1711614023574 获取当前时间，毫秒
    }

    public static void methodMills2() {
        Date dateMills = new Date();
        long time = dateMills.getTime();
        System.out.println(time);                       // 1711614023574 获取当前时间，毫秒
        System.out.println("======================");
    }

    public static void methodDate() {
        Date date = new Date();             //获取系统当前时间
        System.out.println(date);           //Thu Mar 28 16:08:23 CST 2024
        Date date1 = new Date(0L);
        System.out.println(date1);          //Thu Jan 01 08:00:00 CST 1970
        Date date2 = new Date(158300923855L);
        System.out.println(date2);          //Tue Jan 07 12:28:43 CST 1975
    }
}
