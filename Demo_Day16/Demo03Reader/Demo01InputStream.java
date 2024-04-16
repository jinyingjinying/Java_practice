package Demo03Reader;

/*
    java.io.Reader抽象类是表示用于读取字符流的所有类的超类，
    可以读取字符信息到内存中。它定义了字符输入流的基本共性功能方法。

    public void close()：关闭此流并释放与此流相关联的任何系统资源。
    public int read()： 从输入流读取一个字符。
    public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组cbuf中 。

    UTF-8 中文是2个字符，GBK 中文是3个字符
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "D:\\document\\Scripts\\02-Java语言进阶\\day09_字节流、字符流\\c.txt");
        int len = 0;
        while ((len = fis.read())!= -1) {
            System.out.println(len);
        }
        fis.close();
    }
}
