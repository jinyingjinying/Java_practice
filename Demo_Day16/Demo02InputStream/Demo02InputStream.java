package Demo02InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    read(byte[] b)，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读取到末尾时，返回`-1`
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "D:\\document\\Scripts\\02-Java语言进阶\\day09_字节流、字符流\\b.txt");
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes))!= -1) {
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
    }
}
