package Demo03;

public class Demo02StaticMethod {

    public static void main(String[] args) {
        // 一旦使用static修饰成员方法，这就成为了静态方法
        // 静态方法不属于对象，而是属于类

        // 没有static时，需要首先创建对象才能通过对象使用
        MyClass obj = new MyClass();
        obj.method();
        // 对于静态方法可以通过对象名进行调用，也可以通过类名称调用
        obj.methodStatic();     //正确不推荐
        MyClass.methodStatic();

        // 本类当中的静态方法可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod();
    }

    public static void myMethod() {
        System.out.println("自己的方法。");
    }
}
