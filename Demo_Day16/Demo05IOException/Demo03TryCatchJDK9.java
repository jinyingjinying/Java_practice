package Demo05IOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03TryCatchJDK9 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("Day09_IO_Properties\\1_io.jpg");
        FileOutputStream fos = new FileOutputStream(("Day09_IO_Properties\\1_io_copy2.jpg"));
        try (fis; fos) {
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
