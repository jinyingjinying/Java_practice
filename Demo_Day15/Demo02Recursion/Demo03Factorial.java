package Demo02Recursion;

public class Demo03Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = getFactorial(num);
        System.out.println("阶乘结果为：" + factorial);
    }
    public static int getFactorial(int num) {
        if(num == 1) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }
}
