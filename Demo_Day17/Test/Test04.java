package Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
    描述:分析以下需求，并用代码实现
	实现一个验证码小程序，要求如下：
	1. 在项目根目录下新建一个文件：data.txt
	2. 键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
	3. 键盘录入一个需要被校验的验证码，
	4. 如果输入的验证码在data.txt中存在：在控制台提示验证成功;
	5. 如果不存在，控制台提示验证失败
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        writeString2File();
        verifyCode();
    }

    public static void writeString2File() throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "Day10_IO\\src\\Test\\Test04.txt"));
        String line = null;
        for (int i = 1; i < 4; i++) {
            System.out.println("请输入第" + i + "个字符串验证码：");
            line = sc.nextLine();
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }

    private static void verifyCode() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(
                "Day10_IO\\src\\Test\\Test04.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line = null;
        while((line = br.readLine())!= null) {
            list.add(line);
        }
        br.close();
        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的验证码：");
        String code = sc.nextLine();
        if(list.contains(code)) {
            System.out.println("验证成功！");
        } else {
            System.out.println("验证失败！");
        }
    }
}
