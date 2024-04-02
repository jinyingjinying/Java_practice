package Demo03;

/*
*   可变参数：当方法的参数列表数据类型已经确定，但参数个数不确定，可以使用可变参数
*       定义方法时使用：定义方法时使用：修饰符 返回值类型 方法名(参数类型... 变量名){  }
*       原理：可变参数底层上是数组，根据传递参数不同创建不同长度的数组，来存储这些参数
*             传递的参数个数可以是0个（不传递）或多个
*       注意事项：一个方法的参数列表只能有一个可变参数
*                 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
* */

public class Demo01VarArgs {
    public static void main(String[] args) {
        int sum = method01(10, 20, 30, 40, 50);
        System.out.println(sum);
        method02("这几个数的和为", 10, 20, 30, 40, 50);
    }

    public static void method02(String a, int...arr) {
        int sum = 0;
        for (int b: arr) {
            sum += b;
            System.out.print(b + ",");
        }
        System.out.println(a + sum);
    }
    // 定义计算（0-n）整数和的方法
    private static int method01(int... arr) { // 创建数组
        System.out.println(arr);            // 数组地址 new int[]{10, 20}
        System.out.println(arr.length);     // 0
        int sum = 0;
        for (int a: arr) {
            sum += a;
        }
        return sum;
    }
}
