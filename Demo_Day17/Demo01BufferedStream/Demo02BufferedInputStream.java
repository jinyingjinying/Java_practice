package Demo01BufferedStream;

/*
    java.io.BufferedInputStream extends InputStream
    字节缓冲输入流
    public BufferedInputStream(OutputStream out)： 创建一个新的缓冲输入流。
    public BufferedInputStream(OutputStream out, int size)： 创建一个指定缓冲区大小的新的缓冲输入流。

    1. 创建FileInputStream对象
    2. 创建BufferedInputStream对象
    3. 使用BufferedInputStream中的read方法
    4. 使用BufferedInputStream中的flush方法
    5. 释放资源
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day10_IO\\src\\Demo01BufferedStream\\bos.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];  //字节数组
        int len = 0;
        while ( (len = bis.read(bytes))!= -1 ) {
            System.out.println(new String(bytes, 0, len));  //把数据写入内部缓冲区
        }
        bis.close();
    }
}
