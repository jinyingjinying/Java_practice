package Demo02Recursion;
/*
    num的累和 = num + (num-1)的累和，
    所以可以把累和的操作定义成一个方法，递归调用
*/
public class Demo02Sum {
    public static void main(String[] args) {
        int num = 5;
        int sum = getSum(num);
        System.out.println("累计求和结果为：" + sum);

    }
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num - 1);
    }
}
