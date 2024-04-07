package Test;
// 创建4个人存储到HashSet中，
// 姓名和年龄相同的人看做同一人不存储。
import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("拉拉",5));
        set.add(new Person("包包",5));
        set.add(new Person("趴趴",5));
        set.add(new Person("杉菜",5));
        for(Person p:set) {
            System.out.println(p);
        }
    }
}
