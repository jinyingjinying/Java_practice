package Demo01;

/* Map集合遍历 键找值方式 */
/* Set<K> keySet<K> */

/*
1. 通过keyset()方法获取Map中所有的键，返回一个Set集合存储所有的键。
2. 遍历键的Set集合，得到每一个键。
3. 通过get(K key)方法获取键所对应的值。
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("李晨", 178);
        map.put("杨过", 188);
        map.put("郑凯", 168);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("---------------------");
        for(String key: set) { //for(String key: map.keySet()) {}
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
