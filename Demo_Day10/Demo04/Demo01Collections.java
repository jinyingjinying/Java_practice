package Demo04;
/*
* java.utils.Collections是【集合工具类】，用来对集合进行操作
* */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Demo01Collections {
    public static void main(String[] args) {
        method01();
        method02();
        method03();
        method04();
    }

    private static void method04() {
        ArrayList<Person> list04 = new ArrayList<>();
        list04.add(new Person("lala", 5));
        list04.add(new Person("baobao", 4));
        list04.add(new Person("zhima", 3));
        list04.add(new Person("laopo", 4));
        Collections.sort(list04, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getName().charAt(0) - o2.getName().charAt(0);
                if (result == 0) {
                    return o1.getAge() - o2.getAge();
                }
                return result;
            }
        });
        System.out.println("自定义排序规则：首字母升序，首字母相同时年龄升序：");
        System.out.println(list04);
        // 自定义排序规则：首字母升序，首字母相同时年龄升序：
        // [Person{name='baobao', age=4}, Person{name='laopo', age=4}, Person{name='lala', age=5}, Person{name='zhima', age=3}]
    }

    private static void method03() {
        //`public static <T> void sort(List<T> list，Comparator<? super T> )`:将集合中元素按照指定规则排序。
        /* Comparable和Comparator的区别：
                Comparable：自己（this）和参数比较，自己需要实现Comparable接口，重写比较的CompareTo方法
                Comparator: 相当于找一个第三方裁判比较两个参数
        */
        ArrayList<Integer> list03 = new ArrayList<>();
        Collections.addAll(list03, 1, 3, 8, 4, 6);
        Collections.sort(list03, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; //升序
            }
        });
        System.out.println(list03);         // [1, 3, 4, 6, 8]
    }

    private static void method02() {
        ArrayList<Person> list02 = new ArrayList<>();
        list02.add(new Person("拉拉", 5));
        list02.add(new Person("包包", 4));
        list02.add(new Person("势利眼", 3));

        //`public static <T> void sort(List<T> list)`:将集合中元素按照默认规则(升序）。
        // 使用前提：被排序集合里面存储的元素必须实现comparable，重写接口中的compareTo方法
        Collections.sort(list02);
        System.out.println(list02);
        //[Person{name='势利眼', age=3}, Person{name='包包', age=4}, Person{name='拉拉', age=5}]
    }

    private static void method01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);           // [a, b, c, d, e]

        //`public static <T> boolean addAll(Collection<T> c, T... elements)  `:往集合中添加一些元素。
        Collections.addAll(list, "f", "g", "h", "i", "j", "k", "1", "3", "2", "8");
        System.out.println(list);           // [a, b, c, d, e, f, g, h, i, j, k, 1, 3, 2, 8]

        //`public static void shuffle(List<?> list) 打乱顺序`:打乱集合顺序。
        Collections.shuffle(list);
        System.out.println(list);           // [3, b, 2, 1, h, d, c, e, i, a, j, f, 8, g, k]

        //`public static <T> void sort(List<T> list)`:将集合中元素按照默认规则(升序）。
        Collections.sort(list);
        System.out.println(list);           // [1, 2, 3, 8, a, b, c, d, e, f, g, h, i, j, k]
    }
}
