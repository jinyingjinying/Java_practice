package Demo09_Anonymous;

import java.util.Scanner;

public class Demo09_Anonymous {

    public static void main(String[] args) {

        /*Person one = new Person();
        one.name = "赵丽颖";
        one.showName();*/

        // sc以普通方式作为方法接收的参数
        System.out.println("input1:");
        Scanner sc1 = new Scanner(System.in);//根据Scanner类创建对象sc1
        input(sc1);

        // sc以匿名对象方式作为方法接收的参数
        System.out.println("input2:");
        input(new Scanner(System.in));

        Scanner sc2 = getScanner();
        System.out.println("input3:");
        int num = sc2.nextInt();
        System.out.println(num);
    }

    public static void input(Scanner sc) {
        int i = sc.nextInt();
        System.out.println(i);
    }

    public static Scanner getScanner() {

        //sc以普通方式作为方法返回值
        //Scanner sc = new Scanner(System.in);
        //return sc;

        //sc以匿名对象方式作为方法返回值
        return new Scanner(System.in);
    }
}
