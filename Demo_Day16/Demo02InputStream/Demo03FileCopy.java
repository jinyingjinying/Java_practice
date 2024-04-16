package Demo02InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "D:\\document\\Scripts\\02-Java语言进阶\\day09_字节流、字符流\\img\\1_io.jpg");
        FileOutputStream fos = new FileOutputStream(("Day09_IO_Properties\\1_io.jpg"));

        //使用数组缓冲读取多个字节，写入多个字节
        byte[] b = new byte[1024];
        int len;
        while( (len = fis.read(b)) != -1 ) {
            fos.write(b, 0, len);
        }
        fos.close();
        fis.close();
    }
}
