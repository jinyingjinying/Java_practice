package Demo02Methods;

/*
    如果需要将流中的元素映射到另一个流中，可以使用 map 方法。
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    该接口需要一个 Function 函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
    java.util.stream.Function 函数式接口，其中唯一的抽象方法为R apply(T t);
 */

import java.util.stream.Stream;

public class Demo03Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> stream2 = stream.map(str -> Integer.parseInt(str));
        stream2.forEach(str2 -> System.out.println(str2));
    }
}
