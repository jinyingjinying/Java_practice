package Demo01Stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo02GetStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        // map通过间接方式转换
        Map<String, String> map = new HashMap<>();
        // 获取键，存储到一个set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();
        // 获取值，存储到一个collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        // 获取键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        // 把数组转换为Stream流， Stream 接口中提供了静态方法of
        String[] array = { "张无忌", "张翠山", "张三丰", "张一元" };
        Stream<String> stream6 = Stream.of(array);

    }

}
