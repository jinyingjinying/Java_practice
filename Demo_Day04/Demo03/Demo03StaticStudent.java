package Demo03;

public class Demo03StaticStudent {

    public static void main(String[] args) {

        Student.room = "图书馆";
        Student one = new Student("包包", 5);
        Student two = new Student("拉拉", 4);

        System.out.println("学号：" + one.getId() + " " +
                "姓名：" + one.getName() + " " +
                "年龄：" + one.getAge() + " " +
                "地点：" + Student.room); //类名称.类变量

        System.out.println("学号：" + two.getId() + " " +
                "姓名：" + two.getName() + " " +
                "年龄：" + two.getAge() + " " +
                "地点：" + Student.room);
    }
}
