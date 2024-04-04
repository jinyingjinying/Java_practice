package Test;

/*
    使用Map集合存储自定义数据类型Car做键，对应的价格做值。
    使用keySet和entrySet两种方式遍历Map集合。
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        HashMap<Car03, Integer> map = new HashMap<>();

        Car03 c1 = new Car03("红旗", "black");
        Car03 c2 = new Car03("奇瑞", "red");
        Car03 c3 = new Car03("奔驰", "silver");
        Car03 c4 = new Car03("奥迪", "grey");

        map.put(c1, 120000);
        map.put(c2, 40000);
        map.put(c3, 520000);
        map.put(c4, 320000);

        Set<Car03> keyset = map.keySet();
        for(Car03 c: keyset) {
            Integer value = map.get(c);
            System.out.println(c.getName() + c.getColor() + value);
        }
        System.out.println("----------------");

        Set<Map.Entry<Car03, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Car03, Integer> entry: entrySet) {
            Car03 key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getName() + key.getColor() + value);
        }
    }
}
