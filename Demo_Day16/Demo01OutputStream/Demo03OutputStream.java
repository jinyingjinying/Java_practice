package Demo01OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(
                "D:\\document\\Scripts\\02-Java语言进阶\\day09_字节流、字符流\\b.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("Java! ".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
