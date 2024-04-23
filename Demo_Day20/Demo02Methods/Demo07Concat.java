package Demo02Methods;

/*
    如果有两个流，希望合并成为一个流，那么可以使用 Stream 接口的【静态方法】 concat
    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */

import java.util.stream.Stream;

public class Demo07Concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("拉拉", "包包", "碗碗", "票票");
        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(s-> System.out.print(s));    //拉拉包包碗碗票票12345

    }
}
