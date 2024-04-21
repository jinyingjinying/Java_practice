package Demo03ObjectStream;

/*
    1. 将存有【多个自定义对象的集合】序列化操作，保存到`list.txt`文件中。
    2. 反序列化`list.txt` ，并遍历集合，打印对象信息。

    1. 把若干Person对象 ，保存到集合ArrayList中。
    2. 把集合序列化。ObjectOutputStream,writeObject
    3. 反序列化读取一次，转换为集合类型。ObjectInputStream,readObject
    4. Object类型的集合转换为ArrayList类型
    5. 遍历集合，打印所有的学生信息
    6. 释放资源
 */

import java.io.*;
import java.util.ArrayList;

public class Demo03ObjectStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("拉拉",5));
        list.add(new Person("包包",3));
        list.add(new Person("泡泡",1));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "Day10_IO\\src\\Demo03ObjectStream\\list.txt"));
        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "Day10_IO\\src\\Demo03ObjectStream\\list.txt"));
        // 读取对象,强转为ArrayList类型
        ArrayList<Person> list2 = (ArrayList<Person>)ois.readObject();
        for (Person person : list2) {
            System.out.println(person);
        }
        ois.close();
        oos.close();
    }
}
