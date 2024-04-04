package Demo02;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("d", "d");
        System.out.println(map);
        LinkedHashMap<String,String> map2 = new LinkedHashMap<>();
        map2.put("a", "a");
        map2.put("c", "c");
        map2.put("b", "b");
        map2.put("d", "d");
        System.out.println(map2);
    }
}
