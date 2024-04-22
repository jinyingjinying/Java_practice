package Demo05Predicate;

/*
    数组当中有多条“姓名+性别”的信息如下，
    请通过 Predicate 接口的拼装将符合要求的字符串筛选到集合ArrayList 中，
    需要同时满足两个条件：1. 必须为女生；2. 姓名为4个字
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo03PredicateTest {
    public static void method(String[] array, Predicate<String> pre1, Predicate<String> pre2) {
        List<String> list = new ArrayList<>();
        for (String str : array) {
            if (pre1.and(pre2).test(str)){
                list.add(str);
            }
        }
        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        method(array,
                (s) -> {return s.split(",")[0].length() == 4;},
                (s) -> {return "女".equals(s.split(",")[1]);
        });
    }
}
