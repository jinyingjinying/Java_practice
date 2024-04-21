package Test;

/*
    现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
    要求：使用gbk编码保存。
 */

import java.io.*;

public class Test05 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "Day10_IO\\src\\Test\\Test05.txt"),"gbk");
        osw.write("我爱java，你呢？");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "Day10_IO\\src\\Test\\Test05.txt"),"gbk");
        int len = 0;
        char[] cbuf = new char[1024];
        while((len = isr.read(cbuf)) != -1) {
            // 把字符数组转换为字符串
            System.out.println(new String(cbuf,0,len));
        }
        isr.close();
    }
}
