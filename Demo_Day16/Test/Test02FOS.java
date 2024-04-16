package Test;

/*
    利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"
    1.	创建字节输出流FileOutputStream对象并指定文件路径。
    2.	调用字节输出流的write(byte[] buf)方法写出数据。
*/


import java.io.FileOutputStream;
import java.io.IOException;

public class Test02FOS {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Day09_IO_Properties\\src\\Test\\Test02.txt");
        byte[] buf = new byte[1024];
        buf = "i love java".getBytes();
        fos.write(buf);
        fos.close();
    }
}
