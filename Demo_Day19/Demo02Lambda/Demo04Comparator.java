package Demo02Lambda;

/*

    如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
    当需要通过一个方法来获取一个java.util.Comparator 接口类型的对象作为排序器时,就可以调该方法获取。
 */

import java.util.Arrays;
import java.util.Comparator;

public class Demo04Comparator {
    public static Comparator<String> getComparator() {
/*
        // 方法的返回值类型是一个接口，可以返回这个接口的匿名内部类
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照字符串的降序排序
                return o2.length()-o1.length();
            }
        };
*/

        // 方法的返回值类型是一个函数式接口，可以返回一个Lambda表达式
        return (String o1, String o2) -> {
            return o2.length()-o1.length();
        };
    }

    public static void main(String[] args) {
        String[] arr = {"jaoieur", "oaiueiorqp", "aoueroquoz"};
        System.out.println(Arrays.toString(arr));   // [jaoieur, oaiueiorqp, aoueroquoz]
        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString(arr));   // [oaiueiorqp, aoueroquoz, jaoieur]
    }
}
