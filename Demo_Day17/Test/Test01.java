package Test;

/*
    描述:利用【高效字节输出流】往C盘下的d.txt文件输出一个字节数。
    操作步骤:
1.	创建字节输出流对象关联文件路径
2.	利用字节输出流对象创建高效字节输出流对象
3.	调用高效字节输出流对象的write方法写出一个字节
4.	关闭高效流，释放资源。
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "Day10_IO\\src\\Test\\test01.txt"));
        bw.write(97);
        bw.close();
    }
}
