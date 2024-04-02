package Demo01;

/*
*   java.util.List接口 extends Collection接口
*       1. 有序
*       2. 有索引
*       3. 允许重复
*       4. 要防止索引越界异常 IndexOutOfBoundsException
*                数组索引越界异常 ArrayIndexOutOfBoundsException
*                字符串索引越界异常 StringIndexOutOfBoundsException
* */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);

        //`public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
        list.add(3, "ppp");
        System.out.println(list);

        //`public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
        String r = list.remove(2);
        System.out.println("被移除的元素是：" + r);
        System.out.println(list);

        //`public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        String s = list.set(4,"A");
        System.out.println("被替换的元素是：" + s);
        System.out.println(list);
        System.out.println("-----------------------");

        //`public E get(int index)`:返回集合中指定位置的元素。
        // 普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
        // 迭代器遍历
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-----------------------");
        // 增强for循环遍历
        for(String str: list) {
            System.out.println(str);
        }
    }
}
