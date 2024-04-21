package Demo03ObjectStream;

/*
    `java.io.ObjectOutputStream ` 类，将Java对象的原始数据类型写出到文件,实现对象的持久存储。
    `public ObjectOutputStream(OutputStream out) `： 创建一个指定OutputStream的ObjectOutputStream。
    `public final void writeObject (Object obj)` : 将指定的对象写出。

    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.txt"));

    1. 一个对象要想序列化，必须满足两个条件:
    * 该类必须实现`java.io.Serializable ` 接口，
        `Serializable` 是一个标记接口，不实现此接口的类将不会使任何状态序列化或反序列化，
        会抛出`NotSerializableException` 。
    * 该类的所有属性必须是可序列化的。
        **对于JVM可以反序列化对象，它必须是能够找到class文件的类。
        如果找不到该类的class文件，则抛出一个 `ClassNotFoundException` 异常。**
        如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用`transient` 关键字修饰。
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "Day10_IO\\src\\Demo03ObjectStream\\Person.txt"));
        oos.writeObject(new Person("lala",5));
        oos.close();
    }
}
