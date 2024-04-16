package Demo06Properties;

/*
    java.util.Properties extends Hashtable<K,V> implements Map<K,V>
    Properties 是唯一一个和IO流结合的集合，表示一个持久的属性集
        可以使用store方法，把集合中的临时数据持久化写道硬盘中存储
        可以使用load方法，把硬盘中保存的文件（键值对），读取到集合中使用

    void store(OutputStream out, String comments)
        字节输出流，不能写入中文，注释用来解释说明保存的文件
    void store(Writer writer, String comments)
        字符输出流，可以写入中文，注释不能使用中文（默认Unicode，""）
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo02Store {
    public static void main(String[] args) throws IOException {
        //创建Properties对象
        Properties p = new Properties();
        p.setProperty("包包", "膀胱炎");
        p.setProperty("大聪明", "猫鼻支");
        p.setProperty("泡泡", "皮炎");

        //创建字符输出流
        FileWriter fw = new FileWriter("Day09_IO_Properties\\Store.txt");

        //把集合中的临时数据通过store方法持久化写入到硬盘中
        p.store(fw, "save data");

        //释放资源
        fw.close();
    }
}
