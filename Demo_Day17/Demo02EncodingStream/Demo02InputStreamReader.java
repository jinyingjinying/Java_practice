package Demo02EncodingStream;

/*
    java.io.InputStreamReader extends Reader
    使用指定的字符集将字符编码为字节。
    - InputStreamReader(InputStream in): 创建一个使用默认字符集的字符流。
    - InputStreamReader(InputStream in, String charsetName): 创建一个指定字符集的字符流。

 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "Day10_IO\\src\\Demo02EncodingStream\\osw1.txt"),"UTF-8");
        InputStreamReader isr1 = new InputStreamReader(new FileInputStream(
                "Day10_IO\\src\\Demo02EncodingStream\\osw1.txt"),"GBK");

        int read;
        // 使用默认编码字符流读取,乱码
        while ((read = isr.read()) != -1) {
            System.out.print((char)read); //��ã����ǽ�ӧ
        }
        isr.close();

        System.out.println("\r");

        // 使用指定编码字符流读取
        while ((read = isr1.read()) != -1) {
            System.out.print((char)read); //你好，我是金缨
        }
        isr1.close();

    }
}
