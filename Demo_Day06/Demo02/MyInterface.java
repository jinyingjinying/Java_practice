package Demo02;

public interface MyInterface extends MyInterfaceA, MyInterfaceB{
    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("多个父接口的默认方法重复了，进行默认方法的覆盖重写");
    }
    //一共有四个抽象方法 methodA, methodB, methodCommon(A,B), method

}
