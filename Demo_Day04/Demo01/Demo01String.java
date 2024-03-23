package Demo01;

public class Demo01String {

    public static void main(String[] args) {

        String str1 = new String(); //空参构造，字符串为空
        System.out.println("空参构造空字符串：" + str1);

        char[] charArray = { 'a', 'b', 'c' };
        String str2 = new String(charArray);
        System.out.println("字符数组构造字符串：" + str2);

        byte[] byteArray = { 97, 98, 99 };
        String str3 = new String(byteArray);
        System.out.println("字节数组构造字符串：" + str3);

        String str4 = "abc";
        System.out.println("直接创建字符串：" + str4);
    }
}
