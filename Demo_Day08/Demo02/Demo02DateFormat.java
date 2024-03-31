package Demo02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {

    public static void main(String[] args) throws ParseException {//也需要throw ParseException

        dateformat();
        dateparse();

    }

    public static void dateformat() {   //把时间转换为特定格式的字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();         //获取系统当前时间

        String str = sdf.format(date);
        System.out.println(date);       //Thu Mar 28 16:33:15 CST 2024
        System.out.println(str);        //2024-03-28 16:33:15
    }

    public static void dateparse() throws ParseException {
        // 把字符串转换为时间
        // throws ParseException是一个声明异常
        // 如果字符串和构造方法中的模式不一样那么就会抛出此异常
        // 调用一个抛出了异常的方法，就必须处理这个异常
        // 要么throws继续声明抛出这一个异常，要么try…catch
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = "2024-03-28 16:37:45"; //不一致时，Unparseable date
        Date date = sdf.parse(str);
        System.out.println(date);           //Thu Mar 28 16:37:45 CST 2024
    }
}
