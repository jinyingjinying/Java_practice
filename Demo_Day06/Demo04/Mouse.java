package Demo04;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.print("Mouse open! ");
    }

    @Override
    public void close() {
        System.out.println("Mouse close! ");
    }

    public void click() {
        System.out.print("Mouse only click! ");
    }
}
