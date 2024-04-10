package Demo02Recursion;

import java.io.File;

public class Demo05FileSearch {
    public static void main(String[] args) {
        File dir = new File("D:\\document\\Scripts\\Java_Advanced\\Day08_File_Recursion\\src\\Demo01File");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if (file.getName().endsWith(".java")) {
                    System.out.println("java文件名：" + file.getAbsolutePath());
                }
            } else {
                printDir(file);
            }
        }
    }
}
