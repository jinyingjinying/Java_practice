package Demo07_Student;

public class Demo03_Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("古力娜扎");
        stu1.setAge(20);
        System.out.println(stu1.getName() + stu1.getAge());

        System.out.println("=====================");

        Student stu2 = new Student("迪丽热巴",20);
        System.out.println(stu2.getName() + stu2.getAge());

    }
}
