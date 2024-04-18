package Demo01BufferedStream;

/*
    java.io.BufferedOutputStream extends OutputStream
    字节缓冲输出流
    public BufferedOutputStream(OutputStream out)： 创建一个新的缓冲输出流。
    public BufferedOutputStream(OutputStream out, int size)： 创建一个指定缓冲区大小的新的缓冲输出流。

    1. 创建FileOutputStream对象
    2. 创建BufferedOutputStream对象
    3. 使用BufferedOutputStream中的write方法
    4. 使用BufferedOutputStream中的flush方法
    5. 释放资源
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Day10_IO\\src\\Demo01BufferedStream\\bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("把数据写入内部缓冲区".getBytes());
        bos.flush();
        bos.close();
    }
}
