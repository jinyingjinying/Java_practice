package Demo01TCP;
/*
    `Socket`类：该类实现客户端套接字，套接字指的是两台设备之间通讯的端点，包含IP地址和端口号的网络单位。
    public Socket(String host, int port)` :创建套接字对象并将其连接到指定主机上的指定端口号。
        host 服务器主机的名称/ip地址
        port 服务器的端口号

    `public InputStream getInputStream()` ： 返回此套接字的输入流。
    `public OutputStream getOutputStream()` ： 返回此套接字的输出流。
    `public void close()` ：关闭此套接字。
    `public void shutdownOutput()` ： 禁用此套接字的输出流。

    实现步骤
    1. 创建客户端对象Socket，绑定服务器的IP地址和端口号
    2. 使用Socket对象的个体getOutputStream()获取网络字节输出流OutputStream对象
    3. 使用网络字节输出流OutputStream对象中的write方法给服务器发送数据
    4. 使用Socket对象的个体getInputStream()获取网络字节输入流InputStream对象
    5. 使用网络字节输入流InputStream对象中的read方法读取服务器回写的数据

    注意事项：
    1. 客户端和服务端进行交互必须使用Socket提供的网络流，不能使用自己创建的流对象
    2. 创建客户端对象Socket时就会去请求服务器经过3次握手建立连接通路，如果服务器没有启动会抛出异常
    3. 如果指定的host是null ，则相当于指定地址为回送地址。
    4，IO流和socket是关联的，关闭就会一起关
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo01TCPClient {
    public static void main(String[] args) throws IOException {
        // 创建客户端socket类
        Socket socket = new Socket("127.0.0.1",8888);

        // os流
        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());

        // is流
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        socket.close();
        //服务器没开启时会抛出ConnectException
    }
}
