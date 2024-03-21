package Demo01;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法！");
    }

    // A和B的methodDefault2重名了，一定要覆盖重写
    @Override
    public void methodDefault2() {
        System.out.println("覆盖重写了重复的接口默认方法！");
    }

    public void methodStatic() {
        System.out.println("写了也没用，不能从这里调用");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写B的抽象方法");
    }
}
