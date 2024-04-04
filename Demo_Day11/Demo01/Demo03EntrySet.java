package Demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* Map集合遍历 键值对方式 */
/*
1.  获取Map集合中，所有的键值对(Entry)对象，以Set集合形式返回。方法提示:`entrySet()`。
2.  遍历包含键值对(Entry)对象的Set集合，得到每一个键值对(Entry)对象。
3.  通过键值对(Entry)对象，获取Entry对象中的键与值。  方法提示:`getkey() getValue()`
* */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("李晨", 178);
        map.put("杨过", 188);
        map.put("郑凯", 168);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------------");
        for(Map.Entry<String, Integer> entry: set) {        //Map.Entry<String, Integer>
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
