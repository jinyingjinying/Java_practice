package Demo02;

public class Demo05StringSplit {

    public static void main(String[] args) {

        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");//返回值是字符串数组
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        //split方法的参数是一个正则表达式
        String str2 = "aaa.bbb.ccc";//不能切【.】【|】【+】【*】等转义字符
        String[] array2 = str2.split("\\.");//在作为参数时，需要加入"\\"
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}