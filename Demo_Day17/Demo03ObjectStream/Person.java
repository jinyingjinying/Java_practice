package Demo03ObjectStream;

/*
    static 静态关键字，静态优先于非静态加载到内存中
    被static修饰的成员变量不能被序列化，序列化的都是对象

    transient 瞬态关键字，被它修饰的成员变量不可以被序列化
    如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用`transient` 关键字修饰。
 */

public class Person implements java.io.Serializable{ //标记型接口
    private static final long serialVersionUID = 1L;
    // 不管是否进行修改，序列号都不变，就可以修改类啦
    private String name;
    //private static transient int age;
    private int age;

    // 当JVM反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，
    // 那么反序列化操作也会失败，抛出一个`InvalidClassException`异常。
    // 版本号不匹配; 包含未知数据类型; 没有可访问的无参数构造方法

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
