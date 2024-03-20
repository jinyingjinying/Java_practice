package Demo03;

public class Demo01StaticField {

    public static void main(String[] args) {
        Student one = new Student("包包", 5);
        Student two = new Student("拉拉", 3);

        one.room = "图书馆";

        System.out.println("学号：" + one.getId() + " " +
                "姓名：" + one.getName() + " " +
                "年龄：" + one.getAge() + " " +
                "地点：" + one.room);
        System.out.println("学号：" + two.getId() + " " +
                "姓名：" + two.getName() + " " +
                "年龄：" + two.getAge() + " " +
                "地点：" + two.room);
    }
}
