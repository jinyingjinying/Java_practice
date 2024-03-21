package Demo05;

public class Cat extends Animal{

    // 子类覆盖重写抽象方法，去掉关键字abstract
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
