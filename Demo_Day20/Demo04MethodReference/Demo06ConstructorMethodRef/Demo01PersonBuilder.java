package Demo04MethodReference.Demo06ConstructorMethodRef;

/* 类的构造器（构造方法）引用*/

public class Demo01PersonBuilder {
    // 定义方法，参数传递姓名和PersonBuilder接口，方法中创建对象
    public static void printName(String name, PersonBuilder pb) {
        Person person = pb.buildPerson(name);
        System.out.println(person);
    }

    public static void main(String[] args) {
        printName( "拉拉", (name) -> {
            return new Person(name);});

        printName("包包", Person::new);
    }
}
