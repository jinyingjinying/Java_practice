package Demo05Predicate;

/*
    java.util.function.Predicate<T> 接口:对某种类型的数据进行判断，从而得到一个boolean值结果。
    Predicate 接口中包含一个抽象方法： boolean test(T t) 。
 */

import java.util.function.Predicate;

public class Demo01Predicate {
    public static boolean check(String str, Predicate<String> pre) {
        return pre.test(str);
    }

    public static void main(String[] args) {
        String str = "abcde";
        boolean b = check(str, (String s) -> {
            // 对参数传递的字符串进行判断，长度是否大于5
            return str.length() > 5;
        });
        System.out.println(b);
    }
}
