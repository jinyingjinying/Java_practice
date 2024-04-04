package Demo03;

// F8：step over, 逐行执行程序
// F7：进入到方法中
// shift + F8：跳出方法
// F9：跳到下一个断点，没有下一个断点就结束程序
// ctrl + F2：退出debug模式，停止程序
// Console：切换到控制台

public class Demo02Debug {
    public static void main(String[] args) {
/*
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
*/

/*
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
*/
        print();
    }

    private static void print() {
        System.out.println("Heelllasiueo");
        System.out.println("Heelllasiueo");
        System.out.println("Heelllasiueo");
        System.out.println("Heelllasiueo");
    }
}
