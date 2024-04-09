package Demo01File;

import java.io.File;
import java.io.IOException;

/*
    - `public boolean createNewFile()`：当且仅当具有该名称的文件尚不存在时，创建一个新的【空文件】。
    - `public boolean mkdir()` ：创建由此File表示的目录。单级空文件。
    - `public boolean mkdirs()`：创建由此File表示的目录，包括任何必需但不存在的父目录。单级或多级空文件。
    - `public boolean delete()`：删除由此File表示的文件或目录。
*/
public class Demo04CreateDelete {
    public static void main(String[] args) throws IOException {

        File f1 = new File("D:\\document\\Scripts\\02-Java语言进阶\\day08_File类、递归\\1.txt");
        System.out.println(f1.createNewFile());     //true
        System.out.println(f1.createNewFile());     //false 已经存在，创建失败

        File f2 = new File("D:\\document\\Scripts\\02-Java语言进阶\\day08_File类、递归\\文件夹");
        System.out.println(f2.createNewFile());     //true 创建了一个名为文件夹的文件

/*
        File f3 = new File("D:\\document\\Scripts\\不存在的路径\\day08_File类、递归\\文件夹");
        System.out.println(f3.createNewFile());     //抛出异常 IOException 找不到指定的路径
*/
        System.out.println("-----------------------");
        File f4 = new File("D:\\document\\Scripts\\02-Java语言进阶\\day08_File类、递归\\newdir");
        System.out.println(f4.mkdir());             //true

        File f5 = new File("D:\\document\\Scripts\\02-Java语言进阶\\day08_File类、递归\\newdir\\new1\\new2\\new3");
        System.out.println(f5.mkdir());             //false
        System.out.println(f5.mkdirs());            //true

        File f6 = new File("D:\\document\\Scripts\\不存在的路径\\day08_File类、递归\\newdir.txt");
        System.out.println(f6.mkdir());             //false
        System.out.println("------------------------");

        System.out.println(f1.delete());
        System.out.println(f2.delete());
        System.out.println(f4.delete());    //false 多级文件夹
        System.out.println(f5.delete());
    }
}
