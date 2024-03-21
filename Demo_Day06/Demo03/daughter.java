package Demo03;

public class daughter extends kid {

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("daughter方法");
    }

    public void methodZi() {
        System.out.println("daughter only");
    }
}
