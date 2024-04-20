package Demo01BufferedStream;

/*
    java.io.BufferedReader extends Reader
        * `public BufferedReader(Reader in)` ：创建一个新的缓冲输入流。
        BufferedReader：`public String readLine()`: 读一行文字。
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo05BufferedReader{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(
                "Day10_IO\\src\\Demo01BufferedStream\\bw.txt"));
        String line = null;
        while( (line = br.readLine()) != null ) {
            System.out.println(line);
            System.out.println("=============");
        }
        br.close();
    }
}
