package Test;

/*
    利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
    1.	创建字节输入流对象关联文件路径：E盘下的a.png
    2.	创建字节输出流对象关联文件路径：D盘下的a.png
    3.	使用循环不断从字节输入流读取一个字节，每读取一个字节就利用输出流写出一个字节。
    4.	关闭流，释放资源

 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day09_IO_Properties\\1_io.jpg");
        FileOutputStream fos = new FileOutputStream("Day09_IO_Properties\\1_io_copy2.jpg");
        int len = 0;
        while ((len = fis.read())!=-1) {
            fos.write(len);
        }
        fos.close();
        fis.close();


    }
}
