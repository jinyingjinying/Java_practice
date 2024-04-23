package Demo02Methods;

/*
    可以通过 filter 方法将一个流转换成另一个子集流。
    Stream<T> filter(Predicate<? super T> predicate);
    该接口接收一个 Predicate 函数式接口参数（可以是一个Lambda或方法引用）作为筛选条件
    java.util.stream.Predicate 函数式接口，其中唯一的抽象方法为boolean test(T t);
    如果结果为true，那么Stream流的 filter 方法将会留用元素；如果结果为false，那么 filter 方法将会舍弃元素
 */

import java.util.stream.Stream;

public class Demo02Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("拉拉", "包包", "碗碗", "票票");
        Stream<String> stream2 = stream.filter(name -> name.startsWith("拉"));
        stream2.forEach(s -> System.out.println(s));

        //Stream属于管道流，只能被使用一次。
        //stream.forEach(s2 -> System.out.println(s2));   //IllegalStateException
    }
}
