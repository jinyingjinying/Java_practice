package Demo02EncodingStream;

/*
    java.io.OutputStreamWriter extends Writer
    使用指定的字符集将字符编码为字节。
    - OutputStreamWriter(OutputStream in): 创建一个使用默认字符集的字符流。
    - OutputStreamWriter(OutputStream in, String charsetName): 创建一个指定字符集的字符流。

 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "Day10_IO\\src\\Demo02EncodingStream\\osw.txt"));
        osw.write("你好，我是金缨");   //utf-8 21字节
        osw.close();

        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream(
                "Day10_IO\\src\\Demo02EncodingStream\\osw1.txt"),"GBK");
        osw1.write("你好，我是金缨");  //gb2312 14字节
        osw1.close();
    }
}
