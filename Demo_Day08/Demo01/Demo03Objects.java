package Demo01;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "aaa";

        // boolean b = s1.equals(s2);
        // equals中容易出现空指针异常,空指针无法调用方法
        // Objects.equals方法解决了这个问题

        boolean b = Objects.equals(s1, s2);
        System.out.println(b);
    }
}
