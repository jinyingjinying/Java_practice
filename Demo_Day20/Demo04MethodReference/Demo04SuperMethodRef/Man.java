package Demo04MethodReference.Demo04SuperMethodRef;

public class Man extends Human{
    // 重写父类sayHello的方法
    @Override
    public void sayHello() {
        System.out.println("Hello, I am subclass");
    }

    // 定义方法method，参数传递Greetable接口
    public void method (Greetable g) {
        g.greet();
    }

    public void show () {
        // 调用method，方法的参数是函数式接口
        method(() -> {
            // 创建父类对象
            Human human = new Human();
            human.sayHello();
        });

        // 通过super关键字调用成员方法
        method(() -> {
            super.sayHello();
        });

        // 通过super进行方法引用
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
