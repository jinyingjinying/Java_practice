package Demo01;

public interface MyInterfaceA {

    // 常量
    public static final int NUM_OF_MY_CLASS = 10;

    //抽象方法
    public abstract void methodAbs();

    //接口里新增抽象方法会报错，所以添加默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法！");
    }

    public default void methodDefault2() {
        System.out.println("这是新添加的默认方法！为了覆盖重写");
    }

    public static void methodStatic() {
        System.out.println("这是接口的静态方法");
    }

    public default void mDefault1() {
        System.out.println("默认方法1");
        mDefault();
    }

    public default void mDefault2() {
        System.out.println("默认方法2");
        mDefault();
    }

    private void mDefault() {
        System.out.print("aaaa");
        System.out.print("bbbb");
        System.out.println("cccc");
    }

    public static void mStatic1() {
        System.out.println("静态方法1");
        mStatic();
    }

    public static void mStatic2() {
        System.out.println("静态方法2");
        mStatic();
    }

    private static void mStatic() {
        System.out.print("AAAA");
        System.out.print("BBBB");
        System.out.println("CCCC");
    }
}
