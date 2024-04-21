package Demo03ObjectStream;

/*
    `java.io.ObjectInputStream 类，将之前使用ObjectOutputStream序列化的原始数据恢复为对象
    如果找不到该类的class文件，则抛出一个 `ClassNotFoundException` 异常。

    `public ObjectInputStream(InputStream in) `： 创建一个指定InputStream的ObjectInputStream
        ObjectInputStream 读取对象的方法：
        - `public final Object readObject ()` : 读取一个对象。
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "Day10_IO\\src\\Demo03ObjectStream\\Person.txt"));
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);

    }
}
