package Demo05IOException;

import java.io.FileWriter;
import java.io.IOException;

/*实际开发中并不能直接抛出异常*/

public class Demo01TryCatch {
    public static void main(String[] args) {
        //提高变量的作用域，令finally可以使用
        FileWriter fw = null;
        try {
            fw = new FileWriter("Day09_IO_Properties\\fw.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write("Hello World" + i + "\r\n");
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
