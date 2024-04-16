package Test;

/*
    我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
    请写一个程序判断是否有"list"这样的键存在，如果有就改变其实为"100"

    1.	创建一个空的Properties集合
    2.	读取数据到集合中
    3.	遍历集合，获取到每一个key
    4.	判断当前的key 是否为 "lisi"，如果是就把"lisi"的值设置为100
    5.	把集合中所有的信息，重新存储到文件中
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test07Properties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("score.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            if ("lisi".equals(key)) {
                prop.setProperty(key, "100");
            }
        }
        prop.store(new FileOutputStream("score.txt"),"saved");
    }
}
