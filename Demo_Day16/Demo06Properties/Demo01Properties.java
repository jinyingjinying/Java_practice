package Demo06Properties;

/*
    java.util.Properties extends Hashtable<K,V> implements Map<K,V>
    Properties 是唯一一个和IO流结合的集合，表示一个持久的属性集
        可以使用store方法，把集合中的临时数据持久化写道硬盘中存储
        可以使用load方法，把硬盘中保存的文件（键值对），读取到集合中使用

    Properties属性列表中每个键及其对应值都是一个字符串
        Properties集合是一个双列集合，key和value默认都是字符串

    public Properties():创建一个空的属性列表。
*/

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
/*
    使用Properties集合存储数据，再遍历取出其中的数据
    - public Object setProperty(String key, String value)： 保存一对属性。
    - public String getProperty(String key)：使用此属性列表中指定的键搜索属性值。
    - public Set<String> stringPropertyNames()：所有键的名称的集合。
*/
        Properties p = new Properties();
        p.setProperty("包包", "膀胱炎");
        p.setProperty("大聪明", "猫鼻支");
        p.setProperty("泡泡", "皮炎");
        System.out.println(p);

        System.out.println(p.getProperty("包包"));
        System.out.println(p.getProperty("大聪明"));
        System.out.println(p.getProperty("泡泡"));

        Set<String> set = p.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "--->" + p.getProperty(key));
        }
    }
}
