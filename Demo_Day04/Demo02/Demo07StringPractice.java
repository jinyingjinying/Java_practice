package Demo02;

import java.util.Scanner;

public class Demo07StringPractice {

    //键盘录入一个字符，统计字符串中大写字母、小写字母、数字字符、其他个数

    // 1. 键盘输入 scanner
    // 2. 定义四个变量代表四种字符的出现次数
    // 3. string转换成char型数组
    // 4. 遍历char数组进行判断并且四个变量++计数

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();
        char[] chars = input.toCharArray();

        int countUpper = 0, countLower = 0,
                countNumber = 0, countOther = 0;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if(ch >= 'A' && ch <= 'Z') {
                countUpper++;
            } else if( ch >= 'a' && ch <= 'z') {
                countLower++;
            } else if( ch >= '0' && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母有" + countUpper +"个");
        System.out.println("小写字母有" + countLower +"个");
        System.out.println("数字有" + countNumber +"个");
        System.out.println("其他字符有" + countOther +"个");
    }
}
