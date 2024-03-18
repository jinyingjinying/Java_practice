package Demo08_Scanner;

import java.util.Scanner;

import static java.lang.Math.max;

public class Demo08_ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字:");
        int c = sc.nextInt();

        //int max = a >= b ? a : b;
        int max = max(a, b);
        //max = max >= c ? max : c;
        max = max(max, c);
        System.out.println("最大值是" + max);
    }
}
