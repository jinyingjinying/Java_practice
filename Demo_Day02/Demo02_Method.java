public class Demo02_Method {
    public static void main(String[] args) {
        printMethod();

        //单独调用
        sumMethod(10, 20);

        //打印调用
        System.out.println(sumMethod(10, 20));

        //赋值调用
        int number = sumMethod(10, 20);
        System.out.println(number);

        //比较两个数，返回boolean
        boolean bool = compareMethod(3, 8);
        System.out.println(bool);

        //求两个数的和，返回int
        int sum = getSum1(3,8);
        System.out.println(sum);

        //求1-100的和
        int sum100 = getSum2();
        System.out.println(sum100);

        //实现不定次数打印
        printHelloWorld(5);

    }

    private static void printHelloWorld(int time) {
        for (int i = 0; i < time; i++) {
            System.out.println("HelloWorld");
        }
    }

    private static int getSum2() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

    private static int getSum1(int a, int b) {
        int result = a + b;
        return result;
    }

    private static boolean compareMethod(int a, int b) {
/*
        if (a == b) {
            return true;
        } else {
            return false;
        }
*/

/*
        boolean same = a == b ;
        return same;
*/

        return a == b;
    }

    private static int sumMethod(int a, int b) {
        int result = a + b;
        return result;
    }

    private static void printMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*"); //print不换行
            }
            System.out.println();//println 自动换行
        }
    }
}
