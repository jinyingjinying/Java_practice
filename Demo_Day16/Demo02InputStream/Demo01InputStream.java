package Demo02InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream: 表示输入字节流的所有类的超类
    - `public abstract int read()`： 从输入流读取数据的下一个字节。
    - `public int read(byte[] b)`： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。
    - `public void close()` ：关闭此输入流并释放与此流相关联的任何系统资源。

    java.io.FileInputStream `类是文件输入流，从文件中读取字节。
        FileInputStream(File file)
        FileInputStream(String name)
*/
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "D:\\document\\Scripts\\02-Java语言进阶\\day09_字节流、字符流\\a.txt");
/*
        // 每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回`-1`
        int len = fis.read();
        System.out.println(len);    // 97
        len = fis.read();
        System.out.println(len);    // 98
        len = fis.read();
        System.out.println(len);    // 99
        len = fis.read();
        System.out.println(len);    // -1
*/
        int len = 0;        //需要一个变量接收读取的数据
        while((len = fis.read()) != -1) {
            System.out.print((char)len);    // abc
        }
        fis.close();
    }
}
