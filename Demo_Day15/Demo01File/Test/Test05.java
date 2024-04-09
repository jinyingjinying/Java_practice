package Demo01File.Test;

import java.io.File;

public class Test05 {
    public static void main(String[] args) {
        File f1 = new File("d:\\a.txt");
        f1.delete();
        File f2 = new File("d:\\aaa");
        f2.delete();
    }
}
