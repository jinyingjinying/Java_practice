package Demo02;

public class Demo04StringConvert {

    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] chars = str.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        byte[] bytes = str.getBytes();
        System.out.println(bytes[0]);

        //字符串是不能改变的，需传给新字符串
        String str1 = str.replace("o", "*");
        System.out.println(str);
        System.out.println(str1);
    }
}
