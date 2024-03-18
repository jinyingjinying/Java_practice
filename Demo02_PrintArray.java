import java.util.Arrays;

public class Demo02_PrintArray {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        // 面向过程的输出
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if ( i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("=======================");

        // 面向对象的输出
        // Arrays类，其中的toString方法
        System.out.println(Arrays.toString(array));
    }
}
