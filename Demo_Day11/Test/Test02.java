package Test;

/*
    往一个Map集合中添加若干元素。
    获取Map中的所有value。
    使用增强for和迭代器遍历输出每个value。
*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        map.put("d","d");

        Collection<String> values = map.values();
        System.out.println(values);

        for (String s: values) {
            System.out.println(s);
        }

        Iterator<String> it = values.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
