package Demo01TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    `ServerSocket`类：这个类实现了服务器套接字，该对象等待通过网络的请求。
    `public ServerSocket(int port)` ：使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指定的端口号上，
    `public Socket accept()` ：侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法会一直阻塞直到建立连接。

    实现步骤：
    1. 创建服务器ServerSocket对象和系统要指定的端口号
    2. 使用ServerSocket对象那个中的accept方法获取请求的客户端对象Socket
    3. 使用Socket对象的个体getInputStream()获取网络字节输入流InputStream对象
    4. 使用网络字节输入流InputStream对象中的read方法读取客户端发送的数据
    5. 使用Socket对象的个体getOutputStream()获取网络字节输出流OutputStream对象
    6. 使用网络字节输出流OutputStream对象中的write方法给客户端发送数据
    7. 释放资源（Socket,ServerSocket)
 */
public class Demo02TCPServer {
    public static void main(String[] args) throws IOException {
        // 创建服务器
        ServerSocket server = new ServerSocket(8888);
        // 获取客户端
        Socket socket = server.accept();

        // is流
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        // os流
        OutputStream os = socket.getOutputStream();
        os.write("收到谢谢".getBytes());

        socket.close();
        server.close();
    }
}
