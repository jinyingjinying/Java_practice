package Demo03;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo01JDK9 {
    public static void main(String[] args) {
        //新的List、Set、Map的静态工厂方法可以更方便地创建集合的不可变实例。
        //static <E> list<E> of (E... elements)
        //当集合中存储地元素个数已经确定，不再改变时使用
        //不能再使用add，put方法添加元素
        //Set,Map接口再调用of方法的时候不能有重复的元素

        List<String> list = List.of ("a", "b", "c", "a", "d");
        System.out.println(list);   // [a, b, c, a, d]
        //list.add("e");            // UnsupportedOperationException

        Set<String> set = Set.of("a", "b", "c", "d", "e");
        System.out.println(set);    // [a, b, c, d, e]
        //set.add("f");             // UnsupportedOperationException

        Map<String, Integer> map = Map.of("包包", 5, "拉拉", 4, "仔仔", 4);
        System.out.println(map);    //{包包=5, 拉拉=4, 仔仔=4}
    }
}
