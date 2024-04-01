package Demo01;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03ForEach {
    // 增强for循环，内部原理是一个迭代器，仅仅用于遍历Collection和数组。
    // 通常只进行遍历元素，不要在遍历的过程中对集合元素进行增删操作
    // Collection<E> extends Iterable<E>
    // public interface Iterable<T>实现这个接口允许对象成为“foreach”语句的目标
    // 新for循环必须有被遍历的目标,目标只能是Collection或者是数组。

    public static void main(String[] args) {
        method01();         // 12345
        System.out.println();
        method02();         // aaabbbcccddd
    }

    private static void method02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String str: list) {
            System.out.print(str);
        }
    }

    private static void method01() {
        int[] array = { 1, 2, 3, 4, 5 };
        for(int i: array) {
            System.out.print(i);
        }
    }
}
