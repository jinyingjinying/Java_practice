package Demo01;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    private static void show04() {
        //`public boolean containsKey(Object key)  ` 判断集合中是否包含指定的键。
        System.out.println("---------------------");
        Map<String, Integer> map = new HashMap<>();
        map.put("李晨", 178);
        map.put("杨过", 188);
        map.put("郑凯", 168);
        boolean b1 = map.containsKey("郑凯");
        System.out.println(b1);         //true
    }

    private static void show03() {
        //`public V get(Object key)` 根据指定的键，在Map集合中获取对应的值。
        // key存在，返回值V是对应的值，key不存在，V返回值是null
        System.out.println("---------------------");
        Map<String, Integer> map = new HashMap<>();
        map.put("李晨", 178);
        map.put("杨过", 188);
        map.put("郑凯", 168);
        Integer v1 = map.get("郑凯");
        System.out.println(v1);             //168
        System.out.println(map);            //{杨过=188, 李晨=178, 郑凯=168}
    }

    private static void show02() {
        //`public V remove(Object key)`: 把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值。
        // key存在，返回值V是被删除的值，key不存在，V返回值是null
        System.out.println("---------------------");
        Map<String, Integer> map = new HashMap<>();
        map.put("李晨", 178);
        map.put("杨过", 188);
        map.put("郑凯", 168);
        System.out.println(map);
        Integer v1 = map.remove("尹志平");
        Integer v2 = map.remove("郑凯");
        System.out.println(v1);             //null
        System.out.println(v2);             //168
        System.out.println(map);            //{杨过=188, 李晨=178}
    }

    private static void show01() {
        //`public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
        // 存储键值对的时候，key不重复返回值V是null，key重复则使用新的value替换，返回被替换的value
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("谢霆锋", "张柏芝");
        System.out.println("v1：" + v1);         //null
        String v2 = map.put("谢霆锋", "王菲");
        System.out.println("v2：" + v2);         //张柏芝

        map.put("李晨", "范冰冰");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");

        System.out.println(map);                //{杨过=小龙女, 尹志平=小龙女, 李晨=范冰冰, 谢霆锋=王菲}
    }
}
