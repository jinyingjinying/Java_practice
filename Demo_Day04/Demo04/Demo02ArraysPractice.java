package Demo04;

import java.util.Arrays;
import java.util.Scanner;

public class Demo02ArraysPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入随机字符串：");
        String str = sc.next();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        // 倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
