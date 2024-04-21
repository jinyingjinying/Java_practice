package Demo03BSTCP;

/*
    浏览器工作原理是遇到图片会开启一个线程进行单独的访问。
    页面中如果有图片，就会单独开启一个线程读取服务器的图片。
    所以要让服务器处于监听状态，客户端请求一次，服务器回写一次。
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo02TCPServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);

        while(true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
/*
                        GET/web/index.html HTTP/1.1是浏览器的请求消息。
                        /web/index.html为浏览器想要请求的服务器端的资源。
                        使用字符串切割方式获取到请求的资源。
*/
                        // 转换流读取浏览器的请求消息 “GET /Day11_Net/web/index.html HTTP/1.1”
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String requst = br.readLine();//读取第一行
                        // 取出请求资源的路径，去掉web前面的/
                        String[] array = requst.split(" "); // array[1]: "/Day11_Net/web/index.html HTTP/1.1"
                        String path = array[1].substring(1);
                        System.out.println(path);   //  "Day11_Net/web/index.html HTTP/1.1"

                        //创建本地字节输入流绑定html路径
                        FileInputStream fis = new FileInputStream(path);
                        OutputStream os = socket.getOutputStream();

                        // 写入HTTP协议响应头,固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        os.write("\r\n".getBytes());

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while((len = fis.read(bytes))!=-1) {
                            os.write(bytes,0, len);
                        }

                        fis.close();
                        br.close();
                        socket.close();
                        //serverSocket.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }
}
