package Demo02Methods;

/*
    limit 方法可以对流进行截取，只取用前n个
    参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作。
 */

import java.util.stream.Stream;

public class Demo05Limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("拉拉", "包包", "碗碗", "票票");
        Stream<String> limitStream = stream.limit(3);
        limitStream.forEach(str -> System.out.println(str));
    }
}
