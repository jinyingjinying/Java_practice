package Demo11_Array;

import java.util.ArrayList;

public class Demo11_Test02 {

    public static void main(String[] args) {
        // 自定义4个学生对象，添加到集合，并遍历

        // 创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 创建学生对象
        Student stu1 = new Student("包包", 5);
        Student stu2 = new Student("小白", 2);
        Student stu3 = new Student("芝麻", 1);
        Student stu4 = new Student("杉菜", 3);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            //list.get(i)是类的地址
            Student s1 = list.get(i);
            System.out.println(s1.getName() + "今年" + s1.getAge() + "岁");
        }
    }
}
