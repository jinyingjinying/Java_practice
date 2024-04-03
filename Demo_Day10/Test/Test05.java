package Test;

/*
*六、定义一个方法listTest(ArrayList<String> al),
* 要求使用isEmpty()判断al里面是否有元素。
* */

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(listTest(list));
    }

    public static boolean listTest(ArrayList<String> al) {
        return al.isEmpty();
    }
}
