package Demo02FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
    1. 创建对象：服务端ServerSocket
    2. 建立连接并创建对象：Socket accept，；网络字节输出流OutputStream对象，网络字节输入流InputStream对象
    3. 判断文件夹：不存在则创建
    4. 创建对象：本地字节输出流FileOutputStream

    5. 读取文件：网络字节输入流InputStream read
    6. 存储文件：本地字节输出流FileOutputStream write

    7. 回写成功：网络字节输出流OutputStream write
    8. 释放资源：FileOutputStream,Socket, ServerSocket
 */

public class Demo02TCPServer {
    public static void main(String[] args) throws IOException {
        //  1. 创建对象：服务端ServerSocket
        ServerSocket serverSocket = new ServerSocket(8888);

        // 每次接收新的连接,创建一个Socket，服务器一直处于监听状态
        while (true) {
            //  2. 建立连接并创建对象：Socket accept，网络字节输出流OutputStream对象，网络字节输入流InputStream对象
            Socket socket = serverSocket.accept();
            // 使用多线程提高效率，有一个客户端上传文件就开启一个线程完成文件的上传
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        OutputStream os = socket.getOutputStream();
                        InputStream is = socket.getInputStream();

                        //  3. 判断文件夹：不存在则创建
                        File file = new File("Day11_Net\\src\\Demo02FileUpload\\upload");
                        if (!file.exists()) {
                            file.mkdirs();
                        }

                        //  4. 创建对象：本地字节输出流FileOutputStream
                        // 服务端保存文件的名称如果写死，那么最终导致服务器硬盘只会保留一个文件
                        String fileName = "\\upload" + System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";
                        FileOutputStream fos = new FileOutputStream(file + fileName);

                        //  5. 读取文件：网络字节输入流InputStream read
                        //  6. 存储文件：本地字节输出流FileOutputStream write
                        System.out.println("---3---");
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        System.out.println("---4---");

                        //    7. 回写成功：网络字节输出流OutputStream write
                        os.write("上传成功".getBytes());
                        System.out.println("---5---");

                        //    8. 释放资源：FileOutputStream,Socket, ServerSocket
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
            //serverSocket.close();
        }
    }
}
