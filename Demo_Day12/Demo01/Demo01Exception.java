package Demo01;

/*
    java.lang.Throwable：所有异常类的父类
        Error:错误，不能处理，如内存溢出、系统崩溃
        Exception:异常，通过代码的方式纠正
            checkException:编译期异常，如日期格式化异常
            RuntimeException:运行期异常，如数学异常
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) throws ParseException {
//        method01();
//        method02();
//        method03();
        method04();
    }

    private static void method04() {
        int[] arr = {1, 2, 3};
        try {
            // 可能会出现异常的代码
            System.out.println(arr[3]);
        } catch(Exception e) {
            //异常的处理逻辑
            System.out.println(e);      //ArrayIndexOutOfBoundsException
        }
        System.out.println("后续代码");
    }

    private static void method03() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]); //ArrayIndexOutOfBoundsException 越界异常
    }

    private static void method02() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2024.04.07");
        } catch (ParseException e) {
            System.out.println(e);  //RuntimeException 抛出运行期异常
        }
        System.out.println(date);   //null
        System.out.println("后面的代码能/否执行");   //执行
    }

    private static void method01() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2024-04-07");
        System.out.println(date);       //Sun Apr 07 00:00:00 CST 2024
        Date date1 = sdf.parse("2024.04.07");
        System.out.println(date1);      //ParseException 抛出异常 中断处理
        System.out.println("后面的代码能/否执行");
    }
}
