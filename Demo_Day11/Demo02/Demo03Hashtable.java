package Demo02;

import java.util.HashMap;
import java.util.Hashtable;

/*
* java.util.Hashtable<K,V> 集合 implements Map<K,V>集合
* Hashtable 底层是哈希表，单线程集合，速度慢；不能存储null值null键
* HashMap 底层是哈希表，多线程集合，速度快；可以存储null值null键
*
* Hashtable得子类Properties存在，是唯一和IO流相结合得集合
* */
public class Demo03Hashtable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);

        Hashtable<String, String> map2 = new Hashtable<>();
        map2.put(null, "a");
        map2.put("b", null);
        map2.put(null, null);
        System.out.println(map2);       //NullPointerException
    }
}
