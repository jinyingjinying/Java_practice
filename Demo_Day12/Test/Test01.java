package Test;
/*
每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
如果老师给学生赋值一个负数,抛出一个自定异常
*/
public class Test01 {
    public static void main(String[] args) throws NoScoreException {
        Student stu1 = new Student("包包",89);
        Student stu2 = new Student("拉拉",-20);
    }
}
