package Demo06Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo03Load {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();

        // public void load(InputStream inStream)
        // 从字节输入流中读取键值对
        // 匿名对象自动释放资源
        p.load(new FileReader("Day09_IO_Properties\\Store.txt"));
        Set<String> set = p.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "--->" + p.getProperty(key));
        }
    }
}
