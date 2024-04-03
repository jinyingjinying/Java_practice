package Test;

import java.util.ArrayList;

/*
* 定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。
* 可以使用Object[]数组类型接收转换的数组
* */
public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        Object[] obj = arr.toArray();
        for(Object o: obj) {
            System.out.println(o);
        }
    }
}
