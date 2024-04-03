package Test;

/*
* 定义一个方法listTest(ArrayList<Integer> al, Integer s)
* 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1
* */

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);
        al.add(2);
        System.out.println(al);
        System.out.println(listTest(al, 5));
    }
    public static int listTest(ArrayList<Integer> al, Integer s){
        for (int i = 0; i < al.size(); i++) {
            if ( al.get(i) == s) {
                return i;
            }
        }
        return -1;
    }
}
