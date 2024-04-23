package Test;

/*
    已知数组arr1中有如下元素{郭靖，杨康}，
    arr2中有如下元素{黄蓉，穆念慈}，
    使用Stream将二者合并到List集合
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        arr1.add("郭靖");
        arr1.add("杨康");
        arr2.add("黄蓉");
        arr2.add("穆念慈");
        Stream<String> concat = Stream.concat(arr1.stream(), arr2.stream());
        List<String> list = concat.collect(Collectors.toList());
        for (String str : list) {
            System.out.println(str);
        }
    }
}
