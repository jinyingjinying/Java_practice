package Demo02FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    1. 创建对象：本地字节输入流FileInputStream
    2. 创建对象：客户端Socket，网络字节输出流OutputStream对象，网络字节输入流InputStream对象
    3. 读取文件：FileInputStream read
    4. 上传文件：OutputStream write
    5. 读取文件：InputStream read（这一步是为了控制台输出）
    6. 释放资源：FileInputStream, socket
 */

public class Demo01TCPClient {
    public static void main(String[] args) throws IOException {
        //    1. 创建对象：本地字节输入流FileInputStream
        FileInputStream fis = new FileInputStream(
                "D:\\document\\Scripts\\02-Java语言进阶\\day11_网络编程\\img\\1_cs.jpg");

        //    2. 创建对象：客户端Socket，网络字节输出流OutputStream对象，网络字节输入流InputStream对象
        Socket socket  = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();

        //    3. 读取文件：FileInputStream read
        //    4. 上传文件：OutputStream write
        System.out.println("---1---");
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes)) != -1) {
            os.write(bytes,0, len);
            // 在某些输入可用之前，此方法将阻塞。它不执行 in.read(b)
            // 即永远读取不到文档的结束标记，进入阻塞状态
            // 后面的代码执行不到
        }

        /* 写一个结束标记`public void shutdownOutput()` ： 禁用此套接字的输出流。
         * 任何先前写出的数据将被发送，随后终止输出流。 */
        socket.shutdownOutput();
        System.out.println("---2---");

        //    5. 读取回写信息 "上传成功"
        while((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes,0, len) + "ok");
        }
        System.out.println("---6---");

        //    6. 释放资源：FileInputStream, socket
        fis.close();
        socket.close();
    }
}
