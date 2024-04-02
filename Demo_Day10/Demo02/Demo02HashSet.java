package Demo02;

import java.util.HashSet;

public class Demo02HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        String s1 = new String("abc");
        String s2 = new String("anf");
        String s3 = new String("vdf");
        set.add(s1);
        set.add(s2);
        set.add("包包");
        set.add("拉拉");
        set.add("abc");
        System.out.println(set);    //[abc, 包包, 拉拉]

        String s4 = new String("dsoiuwe");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(set.hashCode());
    }
}
