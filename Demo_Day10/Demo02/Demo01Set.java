package Demo02;

/*
*   java.util.Set接口 extends Collection接口
*       1. 不允许重复
*       2. 没有索引，不能普通for循环遍历
*       3. 只能增强for或者iterator
*
*   java.util.HashSet接口 implements Set接口
*       1. 无序集合，存储和去除顺序有可能不一致
*       2. 底层是哈希表结构（查询非常快）
* */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1); //没存进去
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            Integer next = it.next();
            System.out.println(next);
        }
        System.out.println("----------------------");
        for(Integer i: set) {
            System.out.println(i);
        }
        System.out.println("----------------------");
    }
}
