package Demo01BufferedStream;

import java.io.*;

public class Demo03FileCopy {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(
                "D:\\document\\Scripts\\02-Java语言进阶\\day10_缓冲流、转换流、序列化流、Files\\img\\1_charset.jpg");
        FileOutputStream fos = new FileOutputStream(("Day10_IO\\src\\Demo01BufferedStream\\1_charset.jpg"));

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //使用数组缓冲读取多个字节，写入多个字节
        byte[] b = new byte[1024];
        int len;
        while( (len = bis.read(b)) != -1 ) {
            bos.write(b, 0, len);
        }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共用时：" + (e-s) + "毫秒");
        // fos fis 29毫秒
        // bos bis 2毫秒
    }
}
