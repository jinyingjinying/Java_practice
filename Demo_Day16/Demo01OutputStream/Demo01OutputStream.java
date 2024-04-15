package Demo01OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.OutputStream: 表示输出字节流的所有类的超类
    * `public void close()` ：关闭此输出流并释放与此流相关联的任何系统资源。
    * `public void flush() ` ：刷新此输出流并强制任何缓冲的输出字节被写出。
    * `public void write(byte[] b)`：将 b.length字节从指定的字节数组写入此输出流。
    * `public void write(byte[] b, int off, int len)` ：从指定的字节数组写入len字节，从偏移量 off开始输出到此输出流。
    * `public abstract void write(int b)` ：将指定的字节输出流。

    直接已知子类：
    ByteArrayOutputStream, FileOutputStream, FilterOutputStream, ObjectOutputStream, OutputStream, PipedOutputStream

    java.io.FileOutputStream extends OutputStream：文件字节输出流，把内存中的数据写入到硬盘的文件中
    构造方法：
    * `public FileOutputStream(File file)`：创建文件输出流以写入由指定的File对象表示的文件。
    * `public FileOutputStream(String name)`： 创建文件输出流以指定的名称写入文件。
    构造方法的作用
        1. 创建一个FileOutputStream对象
        2. 根据构造方法中的文件/文件名称，创建一个空文件
        3. 把FileOutputStream对象指向创建好的文件

    写入数据的原理（内存--->硬盘）
        java程序---> JVM---> OS操作系统 ---> OS调用写数据的方法 --->把数据写入到文件中

    字节输出流的使用步骤
        1. 创建FileOutputStream对象
        2. 调用FileOutputStream对象中的方法write，把数据写入到文件中
        3. 释放资源（流使用会占用一定内存，使用完毕要清空内存，提高程序效率）
*/
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\document\\Scripts\\02-Java语言进阶\\day09_字节流、字符流\\a.txt");
        fos.write(97);
        fos.close();
    }
}
