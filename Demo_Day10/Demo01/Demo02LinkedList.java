package Demo01;

/*
*   java.util.linkedlist implements List接口
*       1. 底层是链表结构：查询慢，增删快
*       2. 包含大量操作首尾元素的方法
*       3. 使用linkedlist集合特有的方法，不能使用多态
* */

import java.util.LinkedList;

public class Demo02LinkedList {

    public static void main(String[] args) {
        method01();
        method02();
        method03();
    }

    private static void method03() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        linked.add("e");

        //* `public E removeFirst()`:移除并返回此列表的第一个元素。
        //* `public E pop()`:从此列表所表示的堆栈处弹出一个元素。
        linked.removeFirst();
        System.out.println(linked);
        linked.pop();
        System.out.println(linked);
        //* `public E removeLast()`:移除并返回此列表的最后一个元素。
        linked.removeLast();
        System.out.println(linked);
    }

    private static void method02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.clear();

        //* `public boolean isEmpty()`：如果列表不包含元素，则返回true。
        if(!linked.isEmpty()) {
            //* `public E getFirst()`:返回此列表的第一个元素。
            String first = linked.getFirst();
            System.out.println(first);
            //* `public E getLast()`:返回此列表的最后一个元素。
            String last = linked.getLast();
            System.out.println(last);
        } else {
            System.out.println("null!!!");
        }
    }

    public static void method01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //* `public void addFirst(E e)`:将指定元素插入此列表的开头。
        //* `public void push(E e)`:将元素推入此列表所表示的堆栈。
        linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);
        //* `public void addLast(E e)`:将指定元素添加到此列表的结尾。
        //* `public void add(E e)`:将指定元素添加到此列表的结尾。
        linked.addLast("com");
        System.out.println(linked);
    }
}
