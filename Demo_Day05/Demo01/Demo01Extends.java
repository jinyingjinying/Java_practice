package Demo01;

public class Demo01Extends {

    // 在继承的关系中，子类就是一个父类
    // 例如父类是员工，子类是讲师，那么讲师就是一个员工。is-a

    public static void main(String[] args) {
        Teacher teacher = new Teacher(); //创建一个子类对象
        teacher.method();//Teacher类中是空的但继承了Employee
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
