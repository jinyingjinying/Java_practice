package Demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写object类中的toString方法，打印对象属性
    @Override
    public String toString() {
        return "Demo01.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写object类中的equals方法，比较对象属性

/*
    @Override
    public boolean equals(Object obj) {
        // Object obj = p2 = new Demo01.Person("拉拉",5)
        // 继承类不能条用子类独有的成员变量，需强制向下转型

        if (obj == null) return false;  //空为false
        if (this == obj) return true;   //同一个对象true
        if (obj instanceof Demo01.Person) {    //类型相同
            Demo01.Person p = (Demo01.Person)obj;     //向下转型
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        return false;                   //类型不同false
    }
*/

    @Override //equals方法被重写
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
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
