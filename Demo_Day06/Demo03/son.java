package Demo03;

public class son extends kid {

    int num = 10;
    int age = 8;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("son 方法");
    }

    public void methodSon() {
        System.out.println("son only");
    }
}
