package Test;

/*
* 定义一个方法，要求此方法把int数组转成存有相同元素的集合
* (集合里面的元素是Integer)，并返回。()
* */

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(array);          //[I@7ef20235
        ArrayList<Integer> list = new ArrayList<>();
        list = intToArrayList(array);
        System.out.println(list);           //[1, 2, 3, 4, 5]
    }

    public static ArrayList<Integer> intToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int a: array) {
            list.add(a);
        }
        return list;
    }
}
