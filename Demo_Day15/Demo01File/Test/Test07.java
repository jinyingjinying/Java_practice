package Demo01File.Test;

import java.io.File;

public class Test07 {
    public static void main(String[] args) {
        File f = new File("D:\\document\\Scripts\\Java_Advanced\\Day08_File_Recursion\\src\\Demo01File");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
/*
        Demo01FileOverview.java
        Demo02GetPath.java
        Demo03EstimatePath.java
        Demo04CreateDelete.java
        Demo05Traverse.java
        Test
*/
    }
}
