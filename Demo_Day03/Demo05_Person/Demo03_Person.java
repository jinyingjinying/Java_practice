package Demo05_Person;

public class Demo03_Person {

    private String name;
    private int age;

    public void show() {
        System.out.println("我叫：" + name +", 年龄：" + age);
    }

    //对age进行设置，setAge，返回值类型是void
    //这个成员方法专门用来向age设置数据
    //setAge 有参数无返回
    public void setAge(int num) {
        if (num > 0 && num < 100){
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    //这个成员方法专门用来获取age数据
    //getAge 无参数有返回
    public int getAge() {

        return age;
    }

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}
