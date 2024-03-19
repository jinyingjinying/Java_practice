package Demo11_Array;

import java.util.ArrayList;

public class Demo11_ArrayList {
    public static void main(String[] args) {
        // 创建了一个全是String类型的ArrayList集合
        // 从JDK1.7开始，右侧尖括号可以不写内容，但要写<>本身
        ArrayList<String> list  = new ArrayList<>();
        System.out.println(list); //[]
        // ArrayList打印的是内容，重写了toString方法

        // 向ArrayList中添加元素
        list.add("Hello");
        list.add("World");
        boolean success = list.add("Java");
        // 添加的动作是否成功
        System.out.println(success); //true
        System.out.println(list);

        // 读取指定元素
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // 返回集合中元素的个数
        System.out.println(list.size());

        // 删除指定元素，返回被删除的元素
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.size());

        // 遍历输出 数组是array.length,这里是list.size
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
