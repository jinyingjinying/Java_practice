package Demo02Methods;

/*
    流提供 count 方法来数一数其中的元素个数 long count();
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo04Count {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("拉拉", "包包", "碗碗", "票票");
        long count = stream.count();
        System.out.println(count);

    }
}
