package Demo02.Lambda;

// 使用数组存储多个Person对象
// 对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序

import java.util.Arrays;
import java.util.Comparator;

public class Demo03LambdaReturn {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("包包",3),
                new Person("拉拉",5),
                new Person("趴趴",1),
        };

        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge()-o2.getAge();
        });

        Arrays.sort( arr, (o1, o2) -> o1.getAge()- o2.getAge() );

/*
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
*/

        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
