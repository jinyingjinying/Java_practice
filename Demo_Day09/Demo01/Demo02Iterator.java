package Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {
    // Iterator主要用于迭代访问（即遍历）Collection中的元素，因此Iterator对象也被称为迭代器
    // 使用Iterator接口的实现类对象，来获取实现类
    // Collection接口中的iterator()方法返回的就是迭代器的实现类对象
    // 使用步骤：
    //    1. 使用集合中的iterator()方法获取迭代器的实现对象，使用Iterator接口接收（多态）
    //    2. 使用Iterator接口中的hasNext()方法判断还有没有下一个元素：public boolean hasNext()
    //    3. 使用Iterator接口中的Next()方法取出集合中的下一个元素：public E Next()

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Nicky");
        coll.add("芝麻");
        coll.add("杉菜");
        System.out.println(coll);       // [Nicky, 芝麻, 杉菜]

        Iterator<String> it = coll.iterator();
        while(it.hasNext()) {
            String str = it.next();
            System.out.print(str);      // Nicky芝麻杉菜
        }

        System.out.println();
        System.out.println("==================================");

        for(Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            String str2 = it2.next();
            System.out.print(str2);     // Nicky芝麻杉菜
        }
    }
}
