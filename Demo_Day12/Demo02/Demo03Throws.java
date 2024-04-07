package Demo02;
// 关键字throws运用于方法声明之上
// 用于表示当前方法不处理异常，而是提醒该方法的调用者来处理异常(抛出异常)。

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo03Throws {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        readFile("c:\\a.docx");
    }

    public static void readFile(String fileName) throws FileNotFoundException, IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("传递的文件格式不是txt");
        }
        System.out.println("文件格式没有问题");
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
        System.out.println("路径没有问题");

    }
}
