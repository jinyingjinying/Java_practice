package Demo02;

import java.io.IOException;

public class Demo04TryCatch {
    public static void main(String[] args) throws IOException {
        try {
            readFile("d://a.tx");
            System.out.println("有异常时不处理~");
        } catch (IOException e) {       //try抛出什么异常对象，catch就定义什么异常变量，用于接收异常对象
            /*
             * `public void printStackTrace()`:打印异常的详细信息，最全面
             * `public String getMessage()`:获取发生异常的原因。
             * `public String toString()`:获取异常的类型和异常描述信息(不用)。
             */
            System.out.println("---------------------------------");
            System.out.println(e.getMessage());     //传递的文件格式不是txt
            System.out.println(e.toString());       //java.io.IOException: 传递的文件格式不是txt
            System.out.println(e);                  //java.io.IOException: 传递的文件格式不是txt
            e.printStackTrace();
            //java.io.IOException: 传递的文件格式不是txt
            //      at Demo01.Demo06TryCatch.readFile(Demo06TryCatch.java:27)
            //      at Demo01.Demo06TryCatch.main(Demo06TryCatch.java:9)
            System.out.println("---------------------------------");
        } finally {
            System.out.println("不管程序怎样，这里都将会被执行。");
        }
        System.out.println("后续代码继续执行");
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("传递的文件格式不是txt");
        }
        System.out.println("文件格式没有问题");
    }
}
