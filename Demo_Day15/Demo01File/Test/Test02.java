package Demo01File.Test;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\a.txt");
        if(!f1.exists()){
            f1.createNewFile();
        }
    }
}
