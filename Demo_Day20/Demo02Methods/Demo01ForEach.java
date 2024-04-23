package Demo02Methods;

/*
    void forEach(Consumer<? super T> action);
    该方法接收一个 Consumer 接口函数，会将每一个流元素交给该函数进行处理
    Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。
        用来遍历流中的数据，是一个终结方法
 */

import java.util.stream.Stream;

public class Demo01ForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("拉拉", "包包", "碗碗", "票票");
        stream.forEach( name -> System.out.println(name));
    }
}
