package Demo06_People;

public class Student {

    //成员变量
    private String name;
    private int age;
    //相当于
    //Student stu = new Student()

    //无参数的构造方法
    public Student() {
        System.out.println("无参数构造方法");
    }

    //有参数的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("全参数构造方法");
    }

    //Getter/Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
