package Demo01File;

import java.io.File;

/*
    "D:\document\Scripts"
    操作路径要写成下面这样，避免跨平台路径写死了
    "D:"+File.separator+"document"+File.separator+"Scripts"
*/

public class Demo01FileOverview {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);      //  windows是; Linux是： 路径与路径的分隔符
        String separator = File.separator;
        System.out.println(separator);          //  windows是\ Linux是/  文件名称分隔符

        /*
            构造方法：
            * public File(String pathname)：通过将给定的路径名字符转换为抽象路径名来创建新的File实例。
            * public File(String parent, String child)：从父路径名字符串和子路径名字符串创建新的 File实例。
            * public File(File parent, String child)：从父抽象路径名和子路径名字符串创建新的 File实例。
        */
        File f1 = new File("D:\\document\\Scripts\\02-Java语言进阶\\day08_File类、递归\\a.txt");
        System.out.println(f1); //D:\document\Scripts\02-Java语言进阶\day08_File类、递归\a.txt

        File f2 = new File("D:\\document\\Scripts\\02-Java语言进阶\\day08_File类、递归");
        System.out.println(f2); //D:\document\Scripts\02-Java语言进阶\day08_File类、递归

        File f3 = new File("b.txt");
        System.out.println(f3); //b.txt

        File f4 = new File("D:\\document\\Scripts\\02-Java语言进阶\\day08_File类、递归","b.txt");
        System.out.println(f4); //D:\document\Scripts\02-Java语言进阶\day08_File类、递归\b.txt

        parentChild01("d:\\document","b.txt");    //d:\document\b.txt

        File parentFile = new File("d:\\document");
        parentChild02(parentFile, "b.txt");                //d:\document\b.txt

    }

    public static void parentChild01(String parent, String child) {
        File file = new File (parent, child);
        System.out.println(file);
    }

    public static void parentChild02(File parent, String child) {
        File file = new File (parent, child);
        System.out.println(file);
    }
}
