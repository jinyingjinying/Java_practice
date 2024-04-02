package Demo02;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
*   java.util.LinkedHashSet 集合 extends HashSet集合
*       底层是哈希表（数组+链表/红黑树）+链表：多了一条链表记录元素的存储顺序，保证元素有序
* */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);    //无序，且不允许重复

        LinkedHashSet linked = new LinkedHashSet();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked); //有序，且不允许重复

    }
}
