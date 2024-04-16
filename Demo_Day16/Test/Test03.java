package Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(
                "Day09_IO_Properties\\src\\Test\\Test02.txt",true);
        byte[] buf = "\r\ni love java".getBytes();
        for (int i = 0; i < 5; i++) {
            fos.write(buf);
        }
        fos.close();
    }
}
