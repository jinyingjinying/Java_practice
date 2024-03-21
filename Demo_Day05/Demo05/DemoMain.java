package Demo05;

public class DemoMain {

    public static void main(String[] args) {
        // Animal animal = new Animal();不能直接创建new抽象类对象
        Cat cat = new Cat();
        cat.eat();
    }
}
