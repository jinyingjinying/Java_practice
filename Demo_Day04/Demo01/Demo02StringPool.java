package Demo01;

public class Demo02StringPool {

    public static void main(String[] args) {
        String str1 = "abc";//字节数组的地址值
        String str2 = "abc";

        char[] charArray = { 'a', 'b', 'c'};//字符数组的地址值
        String str3 = new String(charArray);//new跟字符串常量池没关系

        // 对于基本类型来说，==是进行数值的比较
        // 对于引用类型来说，==时进行【地址值】的比较
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
    }
}
