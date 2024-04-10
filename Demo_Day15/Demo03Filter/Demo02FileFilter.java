package Demo03Filter;

import java.io.File;
import java.io.FileFilter;
/*
    File[] listFiles(FileFilter filter)：用于抽象路径名(File对象)的过滤器
        boolean accept(File pathname)：测试pathname是否应该包含在当前File目录中

    File[] listFiles(FilenameFilter filter)：用于过滤文件名称
        boolean accept(File dir, String name)：测试文件是否应该包含在某一文件列表中

    两个过滤器没有实现类，需要自己写实现类，重写过滤方法accept，自己定义过滤规则
*/

public class Demo02FileFilter {
    public static void main(String[] args) {
        File dir = new File("D:\\document\\Scripts\\02-Java语言进阶");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles(new FileFilter() { //多态 直接覆盖重写
            public boolean accept(File pathname) {  // 返回boolean为true的File对象
                return pathname.getName().endsWith(".md")||pathname.isDirectory();
                                                    // 后面是为了递归
            }
        });//传递过滤器
        for (File file : files) {
            if(file.isFile()) {
                System.out.println("md文件名：" + file.getAbsolutePath());
            } else {
                printDir(file);
            }
        }
    }
}
