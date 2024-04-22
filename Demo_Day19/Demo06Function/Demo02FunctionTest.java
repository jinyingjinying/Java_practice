package Demo06Function;

/*
    使用 Function 进行函数模型的拼接
        1. 将字符串截取数字年龄部分，得到字符串；
        2. 将上一步的字符串转换成为int类型的数字；
        3. 将上一步的int数字累加100，得到结果int数字。
 */

import java.util.function.Function;

public class Demo02FunctionTest {
    public static int method(String str,
                              Function<String, String> one,
                              Function<String, Integer> two,
                              Function<Integer, Integer> three) {
        return one.andThen(two).andThen(three).apply(str);
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        int num = method(str,
                s -> s.split(",")[1],
                s -> Integer.parseInt(s),
                i -> i += 100);
        System.out.println(num);
    }
}
