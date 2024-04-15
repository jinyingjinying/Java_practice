package Demo01OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("D:\\document\\Scripts\\02-Java语言进阶\\day09_字节流、字符流\\b.txt"));
        // 在文件中显示100，需要写入几个字节？
        fos.write(49);
        fos.write(48);
        fos.write(48);                          // 100

        // 或者一次写入多个字节
        byte[] bytes1 = {65, 66, 67, 68, 69};       // ABCDE
        fos.write(bytes1);

        // 第一个字节是正数（0-127），查询ASCII表
        // 第一个字节是负数，第一个和第二个字节组成一个中文，查询系统默认码表（GBK）
        byte[] bytes2 = {-65, -66, -67, 68};        // 烤紻
        fos.write(bytes2);

        // 把字节数组的一部分写入文件中
        fos.write(bytes1, 1, 3);          // BCD

        // 把字符串转换为字节数组
        byte[] bytes3 = "Hello World! ".getBytes();  // Hello World!
        System.out.println(Arrays.toString(bytes3));// [72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33]
        fos.write(bytes3);

        fos.close();
    }
}
