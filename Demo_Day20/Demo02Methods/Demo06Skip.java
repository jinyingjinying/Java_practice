package Demo02Methods;

/*
    如果希望跳过前几个元素，可以使用 skip 方法获取一个截取之后的新流：
    Stream<T> skip(long n)
    如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流
 */

import java.util.stream.Stream;

public class Demo06Skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("拉拉", "包包", "碗碗", "票票");
        Stream<String> skip = stream.skip(2);
        skip.forEach(s  -> System.out.println(s));
    }
}
