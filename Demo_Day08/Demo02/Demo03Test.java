package Demo02;

// 练习题
// 1.获取出生日期，scanner, next
// 2.字符串日期转换成Date格式，DateFormat, parse
// 3.把Date格式的出生日期转换为毫秒值
// 4.获取当前时间，转换为毫秒值
// 5.当前时间-出生日期（毫秒值）
// 6.毫秒值差值转换为“天”格式，s/1000/60/60/24

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo03Test {
    public static void main(String[] args) throws ParseException {

        // 1.获取出生日期，scanner, next
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为yyyy-MM-dd");
        String birthdayString = sc.next();

        // 2.字符串日期转换成Date格式，DateFormat, parse
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayString);

        // 3.把Date格式的出生日期转换为毫秒值
        long birthdayTime = birthdayDate.getTime();

        // 4.获取当前时间，转换为毫秒值
        long todayTime = new Date().getTime();

        // 5.当前时间-出生日期（毫秒值）
        long time = todayTime - birthdayTime;

        // 6.毫秒值差值转换为“天”格式，s/1000/60/60/24
        System.out.println("您出生已经" + time/1000/60/60/24 + "天");
    }
}
