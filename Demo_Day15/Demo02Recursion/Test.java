package Demo02Recursion;


import java.io.File;
import java.io.FileFilter;

/*
    获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
    注意：不包含子文件夹下的文件

    操作步骤:
    1.	创建文件对象关联到指定文件夹，比如：c:/aaa
    2.	调用文件对象的listFiles方法获得文件数组
    3.	遍历文件数组将每一个文件的名字输出到控制台

*/
public class Test {
    public static void main(String[] args) {
        File dir = new File("D:\\document\\Scripts\\Java基础小节练习题答案");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".docx") || pathname.isDirectory();
            }
        });
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("docx文件：" + file.getAbsolutePath());
            }
            else {
                printDir(file);
            }
        }
    }
}
