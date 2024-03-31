package Demo03;

/*Calendar类的成员方法
* public int get(int field)：返回给定日历字段的值，通过静态成员变量来获取
* public void set(int field, int value)：将给定的日历字段设置为给定值。
* public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
* public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
* */

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {

    public static void main(String[] args) {
        method01();         //今天是2024年3月31日
        method02();         //将日期设置为了8888年8月8日
        method03();         //更改后日期为2025年2月28日
        method04();         //将Calendar转换为date：Sun Mar 31 22:57:28 CST 2024
    }

    public static void method01() { //返回给定日历字段的值
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DATE);
        System.out.println("今天是" + year + "年" + month + "月" + day + "日");
    }

    public static void method02() { //将给定的日历字段设置为给定值
        Calendar c = Calendar.getInstance();
        c.set(8888,8,8);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println("将日期设置为了" + year + "年" + month + "月" + day + "日");
    }

    public static void method03() { //根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH,-1);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DATE);
        System.out.println("更改后日期为" + year + "年" + month + "月" + day + "日");
    }

    public static void method04() { //返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println("将Calendar转换为date：" + date);
    }
}
