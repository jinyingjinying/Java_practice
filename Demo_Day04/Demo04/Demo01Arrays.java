package Demo04;

import java.util.Arrays;

public class Demo01Arrays {

    // 将参数数组变成字符串，默认格式
    // public static String toString(数组)

    public static void main(String[] args) {
        int[] intArray = { 10, 20, 30 };
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr); //[10, 20, 30]

        int[] array1 = { 3, 0, 5, 7, 8, 9 };
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1)); //[0, 3, 5, 7, 8, 9]

        String[] array2 = { "Hello", "World", "Picnic" };
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); //[Hello, Picnic, World]
    }

}
