package Demo08_Scanner;

import java.util.Scanner;

public class Demo08_Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //获取键盘输入的一个int数字，int num = sc.nextInt();
        //nextInt代表把字符串转换为int
        int num = sc.nextInt();
        System.out.println(num);

        //获取键盘输入的一个字符串，String str = sc.next();
        String str = sc.next();
        System.out.println(str);
    }



}
