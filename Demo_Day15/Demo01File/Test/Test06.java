package Demo01File.Test;

import java.io.File;

public class Test06 {
    public static void main(String[] args) {
        File f1 = new File("d:\\b.txt");
        System.out.println(f1.getName());
        System.out.println(f1.length());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());

    }
}
