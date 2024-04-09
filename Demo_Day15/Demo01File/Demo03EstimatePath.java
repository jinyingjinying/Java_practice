package Demo01File;

import java.io.File;

/*
    - `public boolean exists()` ：此File表示的文件或目录是否实际存在。
    - `public boolean isDirectory()` ：此File表示的是否为目录。
    - `public boolean isFile()` ：此File表示的是否为文件。
*/

public class Demo03EstimatePath {
    public static void main(String[] args) {
        File f1 = new File("D:\\document\\Scripts\\Java_Advanced");
        System.out.println(f1.exists());        // true
        System.out.println(f1.isDirectory());   // true
        System.out.println(f1.isFile());        // false
        System.out.println("--------------------");

        File f2 = new File("D:\\document\\Scripts\\02-Java笔记\\day08【File类、递归】.md");
        System.out.println(f2.exists());        // true
        System.out.println(f2.isDirectory());   // false
        System.out.println(f2.isFile());        // true
        System.out.println("--------------------");

        // 路径不存在时 都是false
        File f3 = new File("D:\\document\\Scripts\\Java_Ad");
        System.out.println(f3.exists());        // false
        System.out.println(f3.isDirectory());   // false
        System.out.println(f3.isFile());        // false
    }
}
