package Demo02Recursion;

import java.io.File;

public class Demo04MultiDir {
    public static void main(String[] args) {
        File dir = new File("D:\\document\\Scripts\\Java_Advanced\\Day08_File_Recursion\\src\\Demo01File");
        printDir(dir);
    }

    public static void printDir(File dir) {
        File[] files = dir.listFiles();
        /*
      	  判断:
      	  当是文件时,打印绝对路径.
      	  当是目录时,继续调用打印目录的方法,形成递归调用.
      	*/
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名：" + file.getAbsolutePath());
            } else {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("目录名：" + file.getAbsolutePath());
                printDir(file);
            }
        }
    }
}
