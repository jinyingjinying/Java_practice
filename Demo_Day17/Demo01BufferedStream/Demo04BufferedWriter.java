package Demo01BufferedStream;

/*
    java.io.BufferedWriter extends Writer
        * `public BufferedWriter(Writer out)`： 创建一个新的缓冲输出流。
        BufferedWriter：`public void newLine()`: 写入一个行分隔符,由系统属性定义符号。
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "Day10_IO\\src\\Demo01BufferedStream\\bw.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("小猫健健康康");
            // bw.write("\r\n");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
