package Demo02;

// 泛型的上限:  <? extends E> 使用的泛型只能是E类型的子类/本身
// 泛型的下限:  <? super E> 使用的泛型只能是E类型的父类/本身

import java.util.ArrayList;
import java.util.Collection;

public class Demo06Generic {
    public static void main(String[] args) {
        // Integer extends Number extends Object
        // String extends Object
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list1);     //Number的子类
        //getElement1(list2);//报错
        getElement1(list3);     //Number本身
        //getElement1(list4);//报错

        //getElement2(list1);//报错
        //getElement2(list2);//报错
        getElement2(list3);     //Number本身
        getElement2(list4);     //Number父类
    }

    // 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){}
    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){}
}
