package Demo01;

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("拉拉");
        p1.run();
        Person p2 = new Person("包包");
        p2.run();
    }
}
