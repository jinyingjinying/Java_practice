package Demo06_People;

public class Person {

    String name;

    //who是对方的名字，name是我的名字
    //成员变量名前面写this.
    //通过谁调用的方法，谁就是this
    public void sayHello(String name) {
        System.out.println(name + "，你好。我是" + this.name);
    }
}
