package Demo03;

public class Student {

    private String name;
    private int age;
    static String room;

    private int id;

    //学号计数器，每当new一个新对象，计数器++
    private static int idCounter = 0;

    // 无参构造
    public Student() {
        idCounter ++;
    }

    //有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
