package Demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Generic {

    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        // 使用泛型，避免类型转换的麻烦，存什么类型取什么类型
        // 把运行期异常提升到编译期异常
        // 弊端：泛型是什么类型只能存储什么类型
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        // list.add(129090); 会报错
        list.add("bbb");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);        // aaa 3 bbb 3
            System.out.println(str.length());
        }
    }

    private static void show01() {
        // 不适用泛型，默认类型是Object类型，可以存储任意类型的数据
        // 弊端：不安全，会引发异常
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add(129090);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);        //aaa 129090
            //String s = (String) obj;
            //System.out.println(s.length());  //会抛出ClassCastException类型转换异常
        }
    }
}
