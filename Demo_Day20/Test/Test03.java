package Test;

/*
    问题：有如下整数1，-2，-3，4，-5，使用Stream取元素绝对值并打印
 */

import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        stream.map(i -> Math.abs(i)).forEach(System.out::println);
    }
}
