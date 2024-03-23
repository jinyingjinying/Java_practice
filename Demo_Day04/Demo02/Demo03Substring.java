package Demo02;

public class Demo03Substring {

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(5));//World
        System.out.println(str.substring(4, 7));//oWo 左闭右开
        System.out.println(str);//HelloWorld
    }
}
