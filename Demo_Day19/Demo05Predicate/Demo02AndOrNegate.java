package Demo05Predicate;

/*
    默认方法：and &&，有false则false
              or ||， 有true则true
              not !
 */

import java.util.function.Predicate;

public class Demo02AndOrNegate {
    public static void main(String[] args) {
        String str = "qoiujkjfieusew";
        boolean b1 = andMethod(str,
                (s) -> {return str.length() > 5;},
                (s) -> {return str.contains("a");});
        boolean b2 = orMethod(str,
                (s) -> {return str.length() > 5;},
                (s) -> {return str.contains("a");});
        boolean b3 = negMethod(str,
                (s) -> {return str.length() > 5;});
        System.out.println("字符串是否既长度大于5，又包含a："+ b1);
        System.out.println("字符串是否长度大于5或者包含a：" + b2);
        System.out.println("字符串是否长度小于等于5：" + b3);

    }

    public static boolean andMethod(String str, Predicate<String> pre1, Predicate<String> pre2) {
        //return pre1.test(str) && pre2.test(str);
        return pre1.and(pre2).test(str);
    }
    public static boolean orMethod(String str, Predicate<String> pre1, Predicate<String> pre2) {
        // return pre1.test(str) || pre2.test(str)
        return pre1.or(pre2).test(str);
    }
    public static boolean negMethod(String str, Predicate<String> pre) {
        return pre.negate().test(str);
    }
}
