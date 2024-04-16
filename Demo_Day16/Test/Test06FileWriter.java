package Test;

/*
    请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
    可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。

    1.	创建MainAPP类,并包含main()方法
    2.	按照上述要求实现程序

 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test06FileWriter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("Day09_IO_Properties\\Info.txt");
        while (true) {
            System.out.println("请输入需要保存的内容：");
            String str = sc.next();
            if("886".equals(str)) {
                break;
            }
            fw.write(str);
            fw.write("\r\n");
        }
        fw.close();
    }
}
