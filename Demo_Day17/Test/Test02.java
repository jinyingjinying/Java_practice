package Test;

/*
    描述:利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，
    如写出：”i love java”

    操作步骤:
1.	创建字节输出流对象关联文件路径
2.	利用字节输出流对象创建高效字节输出流对象
3.	定义字符串存放要输出的数据，然后将字符串转换为字节数组。
4.	调用高效字节输出流对象的write方法将字节数组输出。
5.	关闭高效流。

 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "Day10_IO\\src\\Test\\test02.txt"));
        bw.write("i love java");
        bw.close();
    }
}
