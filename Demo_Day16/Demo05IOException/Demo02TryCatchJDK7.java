package Demo05IOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02TryCatchJDK7 {


    public static void main(String[] args) {
        // try中定义流对象，自动释放
        try (
                FileInputStream fis = new FileInputStream("Day09_IO_Properties\\1_io.jpg");
                FileOutputStream fos = new FileOutputStream(("Day09_IO_Properties\\1_io_copy.jpg"));) {
            byte[] b = new byte[1024];
            int len;
            while( (len = fis.read(b)) != -1 ) {
                fos.write(b, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
