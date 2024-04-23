package Test;

/*
    有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，
    使用Stream将以郭字开头的元素存入新数组
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        Stream<String> stream1 = stream.filter(s -> s.startsWith("郭"));
        stream1.forEach(System.out::println);

    }
}
