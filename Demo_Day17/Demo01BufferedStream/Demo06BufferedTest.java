package Demo01BufferedStream;

/*
    1. 逐行读取文本信息。
    2. 解析文本信息到集合中。
    3. 遍历集合，按顺序，写出文本信息。
 */

import java.io.*;
import java.util.HashMap;

public class Demo06BufferedTest {
    public static void main(String[] args) throws IOException {
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> lineMap = new HashMap<>();

        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader(
                "Day10_IO\\src\\Demo01BufferedStream\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "Day10_IO\\src\\Demo01BufferedStream\\out.txt"));

        // 读取数据，解析文本，保存到集合
        String line = null;
        while((line = br.readLine())!= null) {
            String[] split = line.split("\\.");
            lineMap.put(split[0],split[1]);
        }
        br.close();

        // 遍历map集合
        for(String key: lineMap.keySet()) {
            String value = lineMap.get(key);
            bw.write(key + "." + value);
            bw.newLine();
        }
        bw.close();
    }
}
