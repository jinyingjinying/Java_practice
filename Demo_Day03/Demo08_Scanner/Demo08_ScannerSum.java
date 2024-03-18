package Demo08_Scanner;

import java.util.Scanner;

public class Demo08_ScannerSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();

        int num = a + b;
        System.out.println("数字之和为" + num);
    }
}
