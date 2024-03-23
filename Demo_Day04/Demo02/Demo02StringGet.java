package Demo02;

public class Demo02StringGet {

    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1.length());//5

        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println(str3);//HelloWorld

        System.out.println(str3.charAt(4));
        System.out.println(str3.indexOf('o'));//4
        System.out.println(str3.indexOf("llo"));//2
        System.out.println(str3.indexOf("abc"));//-1
    }
}
