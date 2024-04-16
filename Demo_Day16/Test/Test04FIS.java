package Test;

/*
    描述:利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
    使用循环读取，一次读取一个字节，直到读取到文件末尾。
    将读取的字节输出到控制台

    1.	创建字节输入流对象指定文件路径。
    2.	调用read(byte b)方法循环读取文件中的数据
    3.	直到读取到-1时结束读取
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Test04FIS {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "Day09_IO_Properties\\src\\Test\\Test02.txt");
        int len = 0;
        byte[] buf = new byte[1024];    //字符数组
        while( (len = fis.read(buf)) != -1 ){
            System.out.println(new String(buf, 0, len));
        }
        fis.close();
    }
}
