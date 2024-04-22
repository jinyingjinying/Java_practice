package Demo01FunctionalInterface;

public class Demo01TestMain {
    // 定义一个方法，参数使用函数式接口MyFunctionalInterface
    public static void show( Demo01MyFunctionalInterface myInter ) {
        myInter.myMethod();
    }

    public static void main(String[] args) {
        // 调用show方法，方法的参数是一个接口，可以传递接口的实现类对象
        show(new Demo01MyFunctionalInterfaceImpl());

        // 调用show方法，方法的参数是一个接口，可以传递接口的匿名内部类
        show(new Demo01MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        // 调用show方法，方法的参数是一个接口，可以使用Lambda表达式
        show(()->{
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });

        // 简化Lambda表达式
        show(()-> System.out.println("使用简化Lambda表达式重写接口中的抽象方法"));
    }
}
