package Demo01File;

import java.io.File;

/*
    绝对路径：以盘符开始
    相对路径，相对于当前项目的根目录
    * `public String getAbsolutePath() ` ：返回此File的绝对路径名字符串。
    * `public String getPath() ` ：将此File转换为路径名字符串。
    * `public String getName()`  ：返回由此File表示的文件或目录的名称。
    * `public long length()`  ：返回由此File表示的文件的长度。
*/
public class Demo02GetPath {
    public static void main(String[] args) {
        getAP();
        System.out.println("----------------------");
        getP();
        System.out.println("----------------------");
        getname();
        System.out.println("----------------------");
        lengthmethod();
    }

    public static void lengthmethod() {
        // File表示的文件的长度
        File f1 = new File("D:\\document\\Scripts\\02-Java语言进阶\\day08_File类、递归\\img\\day08_01_递归累和.jpg");
        System.out.println(f1.length());    //96393(字节)
        File f2 = new File("D:\\document\\Scripts\\02-Java语言进阶\\day08_File类、递归");
        System.out.println(f2.length());    //0 文件夹没有大小概念
    }

    public static void getname() {
        File f1 = new File("D:\\document\\Scripts\\Java_Advanced\\a.txt");
        File f2 = new File("D:\\document\\Scripts\\Java_Advanced");
        System.out.println(f1.getName());   //a.txt
        System.out.println(f2.getName());   //Java_Advanced
    }

    public static void getP() {
        File f1 = new File("D:\\document\\Scripts\\Java_Advanced\\a.txt");
        File f2 = new File("a.txt");
        System.out.println(f1.getPath());   //D:\document\Scripts\Java_Advanced\a.txt
        System.out.println(f2.getPath());   //a.txt
    }

    public static void getAP() {
        File f1 = new File("D:\\document\\Scripts\\Java_Advanced\\a.txt");
        String ap1 = f1.getAbsolutePath();
        System.out.println(ap1);        //D:\document\Scripts\Java_Advanced\a.txt

        File f2 = new File("a.txt");
        String ap2 = f2.getAbsolutePath();
        System.out.println(ap2);        //D:\document\Scripts\Java_Advanced\a.txt
    }
}
