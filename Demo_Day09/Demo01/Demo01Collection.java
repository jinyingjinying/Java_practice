package Demo01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
 * 集合是java中提供的一种容器，可以用来存储多个数据。
 * 数组的长度是固定的，数组中存储的是【同一类型的元素】，可以存储【基本数据类型值】。
 * 集合的长度是可变的，集合存储的都是【对象】，而且【对象的类型可以不一致】。
 * 在开发中一般当对象多的时候，使用集合进行存储。
 * */

public class Demo01Collection {
    // Collection是所有【单列集合的父接口】
    // 因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。
    public static void main(String[] args) {
        //创建集合对象，接口指向实现类，多态
        Collection<String> coll = new ArrayList<>();

        // `public boolean add(E e)`：把给定的对象添加到当前集合中 。
        boolean b1 = coll.add("Nicky");
        System.out.println(b1);     // true
        coll.add("芝麻");
        coll.add("杉菜");
        System.out.println(coll);   // [Nicky, 芝麻, 杉菜]

        // `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
        coll.remove("芝麻");
        System.out.println(coll);   // [Nicky, 杉菜]

        // `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
        boolean b2 = coll.contains("杉菜");
        System.out.println(b2);     // true

        // `public boolean isEmpty()`: 判断当前集合是否为空。
        boolean b3 = coll.isEmpty();
        System.out.println(b3);     // false

        // `public int size()`: 返回集合中元素的个数。
        int num = coll.size();
        System.out.println(num);    // 2

        // `public Object[] toArray()`: 把集合中的元素，存储到数组中。
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);   // Nicky
                                            // 杉菜
        }

        // `public void clear()` :清空集合中所有的元素。
        coll.clear();
        System.out.println(coll);           // []
        System.out.println(coll.isEmpty()); // true
    }





}
