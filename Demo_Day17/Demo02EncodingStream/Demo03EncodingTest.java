package Demo02EncodingStream;

/*
    1. 指定GBK编码的转换流，读取文本文件。
    2. 使用UTF-8编码的转换流，写出文本文件。
 */

import java.io.*;

public class Demo03EncodingTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "Day10_IO\\src\\Demo02EncodingStream\\file_gbk.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "Day10_IO\\src\\Demo02EncodingStream\\file_utf8.txt"),"UTF-8");

        char[] cbuf = new char[1024];
        int len = 0;
        while ((len = isr.read(cbuf))!= -1) {
            osw.write(cbuf,0,len);
        }
        osw.close();
        isr.close();
    }
}
