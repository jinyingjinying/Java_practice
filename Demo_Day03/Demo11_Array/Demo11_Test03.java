package Demo11_Array;

import java.util.ArrayList;

public class Demo11_Test03 {

    public static void main(String[] args) {
        // 定义一个以指定格式打印集合的方法：使用{}括起来，@分隔，即{元素@元素@元素}

        ArrayList<String> list = new ArrayList<>();

        list.add("包包");
        list.add("杉菜");
        list.add("芝麻");
        list.add("小白");

        printArrayList(list);
    }

    // 定义方法三要素：返回值类型，方法名称，参数列表
    // 打印没有返回值，arraylist作为参数
    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }
}


