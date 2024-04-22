package Demo06Function;

/*
    java.util.function.Function<T,R> 接口
    用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件，后者称为后置条件。
    抽象方法： R apply(T t) ，根据类型T的参数获取类型R的结果。
 */

import java.util.function.Function;

public class Demo01Function {
    // 将 String 类型的整数转换为 Integer 类型的整数
    public static void method01(String str, Function<String, Integer> func) {
        int num = func.apply(str);
        System.out.println(num);
    }

    public static void method02(String str, Function<String, Integer> func1, Function<Integer, String> func2) {
        String s = func1.andThen(func2).apply(str);
        System.out.println(s);
    }


    public static void main(String[] args) {
        method01("1000", (s) -> { return Integer.parseInt(s);});
        method02("1000",
                (s) -> { return Integer.parseInt(s) + 10;},
                (i) -> { return i + "";}
        );
    }
}
