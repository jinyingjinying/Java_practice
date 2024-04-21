package Demo04PrintStream;

/*
    `java.io.PrintStream extends OutputStream类，该类能够方便地打印各种数据类型的值，是一种便捷的输出方式。
    `PrintStream`永远不会抛出IOException

    `public PrintStream(File file)： 使用指定的文件名创建一个新的打印流。
    `public PrintStream(OutputStream out)： 使用指定的文件名创建一个新的打印流。
    `public PrintStream(String fileName)： 使用指定的文件名创建一个新的打印流。

    write方法写入数据，查询编码表
    print/println方法写入数据，原样输出

    `System.out`就是`PrintStream`类型的，只不过它的流向是系统规定的，打印在控制台上。
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(
                "Day10_IO\\src\\Demo04PrintStream\\print.txt");
        ps.write(97);
        ps.print(97);

        System.setOut(ps);
        System.out.println(98);
        ps.close();
    }

}
