package Demo02;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String str3 = new String(charArray);

        //比较字符串内容
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        //空指针异常
        /*
        String str4 = null;
        System.out.println("Hello".equals(str4));//false
        System.out.println(str4.equals("Hello"));//NullPointerException
        */

        //忽略大小写
        System.out.println("========================");
        String str5 = "hello";
        System.out.println(str1.equals(str5));
        System.out.println(str1.equalsIgnoreCase(str5));
    }
}
