package Demo04_Students;

public class Demo03_ImportStudents {

    public static void main(String[] args) {
        // 类名称 对象名 = new 类名称 ()
        // 根据Demo03_Students类 创建了一个stu对象
        Demo03_Students stu = new Demo03_Students();

        // 输出有默认值
        System.out.println(stu.name); // null
        System.out.println(stu.age);  // 0

        // 赋值后输出
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);

        // 调用方法
        stu.sleep();
    }

}
