package Test;
/*
    描述:利用高效字节输入流和高效字节输出流完成文件的复制。
    要求：
1.将C盘下的c.png文件复制到D盘下
2.一次读写一个字节数组方式复制
 */

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "D:\\document\\Scripts\\02-Java语言进阶\\day11_网络编程\\day11【网络编程】.md"));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                "D:\\document\\Scripts\\02-Java笔记\\day11【网络编程】.md"));

        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes))!=-1) {
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
    }
}
