package Demo02;

// 泛型的通配符：？代表任意的数据类型
// 不能创建对象使用，只能作为方法的参数使用
// 泛型没有继承概念，不能写Object

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        // ArrayList<?> list03 = new ArrayList<>(?);
        // 不能创建对象使用，只能作为方法的参数使用

        printArray(list01);
        printArray(list02);
    }

    public static void printArray(ArrayList<?> list) {   //遍历arraylist集合，不知道数据类型
        Iterator<?> it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
