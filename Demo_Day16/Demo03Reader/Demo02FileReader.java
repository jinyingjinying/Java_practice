package Demo03Reader;

/*
    java.io.FileReader extends InputStreamReader extends Reader

    FileReader(File file)：创建一个新的FileReader，给定要读取的File对象。
    FileReader(String fileName)：创建一个新的FileReader，给定要读取的文件的名称。

*/

import java.io.FileReader;
import java.io.IOException;

public class Demo02FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(
                "D:\\document\\Scripts\\02-Java语言进阶\\day09_字节流、字符流\\c.txt");
/*
        int len = 0;
        while ((len = fr.read())!= -1) {
            System.out.print((char)len);    //你好AEHRHIjkji..a39
        }                                   //虽然读取了一个字符，但是会自动提升为int类型
*/

        int len = 0;
        char[] cbuf = new char[1024];
        while ((len = fr.read(cbuf))!= -1) {
            System.out.println(new String(cbuf,0,len));    //你好AEHRHIjkji..a39

        }

        fr.close();
    }
}
