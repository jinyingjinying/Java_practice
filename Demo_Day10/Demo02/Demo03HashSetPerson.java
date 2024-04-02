package Demo02;

import java.util.HashSet;

public class Demo03HashSetPerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("拉拉", 5);
        Person p2 = new Person("包包", 6);
        Person p3 = new Person("拉拉", 5);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}
