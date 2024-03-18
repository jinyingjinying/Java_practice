package Demo06_People;

public class Demo03_Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("赵丽颖", 18);
        System.out.println(stu2.getName() + stu2.getAge());

        //更改时仍旧需要setter
        stu2.setAge(21);
        System.out.println(stu2.getName() + stu2.getAge());

    }
}
