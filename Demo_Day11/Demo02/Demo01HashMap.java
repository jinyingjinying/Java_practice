package Demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMap {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        /*   HashMap存储自定义类型键值
         *   key:Person类型（需重写HashCode方法和equals方法，以保证key唯一）
         *   value:String类型，可以重复
         */
        System.out.println("---------------------------------");
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("包包", 5), "图书馆");
        map.put(new Person("杉菜", 5), "7栋");
        map.put(new Person("汤圆", 5), "6栋");
        map.put(new Person("仔仔", 5), "17栋");
        map.put(new Person("仔仔", 5), "17栋");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--->" + value);
        }
    }



    private static void show01() {
        /*   HashMap存储自定义类型键值
         *   key:String类型（重写了HashCode方法和equals方法，可以保证key唯一）
         *   value:Person类型（value可以重复，同名同年龄视为同一个人）
         */
        HashMap<String, Person> map = new HashMap<>();
        map.put("图书馆", new Person("包包", 5));
        map.put("7栋", new Person("杉菜", 5));
        map.put("6栋", new Person("汤圆", 5));
        map.put("17栋", new Person("仔仔", 5));
        Set<String> set = map.keySet();
        for(String key: set) {
            Person value = map.get(key);
            System.out.println(key + "--->" + value);
        }
    }
}
