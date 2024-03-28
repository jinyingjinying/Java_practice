package Demo02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {

    public static void main(String[] args) {

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

    public static void dateparse() {    //把字符串转换为时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();         //获取系统当前时间
        String str = "2024-03-28 16:37:45";
    }
}
