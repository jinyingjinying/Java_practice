package Test;

/*
每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
如果老师给学生赋值一个负数,抛出一个自定异常
*/
public class Student {
    private String name;
    private int score;


    public Student(String name, int score) {
        setName(name);
        setScore(score);
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws NoScoreException {
        if (score < 0) {
            throw new NoScoreException("分数不能为负数：" + score);
        }
        this.score = score;
    }
}
