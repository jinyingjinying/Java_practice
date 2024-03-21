package Demo01;

public class Demo01Interface {

    public static void main(String[] args) {
        MyInterfaceImpl inter = new MyInterfaceImpl();

        System.out.println(MyInterfaceA.NUM_OF_MY_CLASS);
        System.out.println("==========================");

        inter.methodAbs();
        inter.methodDefault();
        inter.methodDefault2();
        System.out.println("==========================");

        // inter.methodStatic(); 错误！
        MyInterfaceA.methodStatic();
        System.out.println("==========================");

        // 普通私有方法
        inter.mDefault1();
        inter.mDefault2();
        System.out.println("==========================");

        // 静态私有方法
        MyInterfaceA.mStatic1();
        MyInterfaceA.mStatic2();
        System.out.println("==========================");
    }
}
