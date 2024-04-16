package Demo04Writer;

/*
    java.io.Writer抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。
    它定义了字节输出流的基本共性功能方法。

    java.io.FileWriter extends OutputStreamWriter extends Writer类是写出字符到文件的便利类。
    构造时使用系统默认的字符编码和默认字节缓冲区。

    FileWriter(File file)： 创建一个新的 FileWriter，给定要读取的File对象。
    FileWriter(String fileName)： 创建一个新的 FileWriter，给定要读取的文件的名称。

    字符流，只能操作文本文件，不能操作图片，视频等非文本文件
*/

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Day09_IO_Properties\\fw.txt", true);

        // 如果不关闭,数据只是保存到缓冲区，并未保存到文件。
        // 但是关闭的流对象，是无法继续写出数据的。
        // 既想写出数据，又想继续使用流，就需要flush方法了

        fw.write("\r\n");
        fw.flush();

        fw.write('刷');
        fw.write('新');
        char[] cs = {'a', 'b', 'c', 'd', 'e'};
        fw.write(cs);
        fw.flush();

        fw.write("关闭");
        fw.write("\r\n");
        fw.flush();

        fw.close();

    }
}
