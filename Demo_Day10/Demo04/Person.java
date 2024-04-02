package Demo04;

import java.util.Objects;

public class Person implements Comparable<Person>{  //实现Comparable接口
    private String name;
    private int age;


    /*
    * Comparable接口的排序规则：
    *   自己（this)-参数：升序
    *   参数-自己（this)：降序
    * */
    @Override
    public int compareTo(Person p) {         // 重写compareTo方法，重写排序规则
        // 比较年龄，年龄升序排序
        return this.getAge() - p.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
