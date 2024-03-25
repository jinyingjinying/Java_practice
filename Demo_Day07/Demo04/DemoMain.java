package Demo04;

public class DemoMain {

    public static void main(String[] args) {
/*
        // 创建实现类对象
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();
        // 左父右子
        MyInterface obj = new MyInterfaceImpl();
        obj.method();
        // 如果接口的实现类或者父类的子类，只需要使用唯一的一次
        // 那么这种情况下就可以省略该类的定义，改为使用【匿名内部类】

        new MyInterfaceImpl();
*/
        // 匿名内部类
        MyInterface obj = new MyInterface() {
            // new 了一个接口，实际是局部内部类，但没有名字，是局部内部类中的匿名内部类
            @Override
            public void method() {
                System.out.println("通过匿名内部类实现类覆盖重写抽象方法！111");
            }
            @Override
            public void method2() {
                System.out.println("通过匿名内部类实现类覆盖重写抽象方法！222");
            }
        }; //有分号，不要忘记
        obj.method();
        obj.method2();

        new MyInterface() {
            // new 了一个接口，实际是局部内部类，但没有名字，是局部内部类中的匿名内部类
            @Override
            public void method() {
                System.out.println("通过匿名内部类实现类覆盖重写抽象方法！111-2");
            }
            @Override
            public void method2() {
                System.out.println("通过匿名内部类实现类覆盖重写抽象方法！222-2");
            }
        }.method();

    }

}
