package Demo04;

public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.print("Keyboard open! ");
    }

    @Override
    public void close() {
        System.out.println("Keyboard close! ");
    }

    public void type() {
        System.out.print("Keyboard only tap! ");
    }
}
