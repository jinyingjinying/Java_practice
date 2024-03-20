package Demo02;

public class Demo02ExtendsMethod {

    public static void main(String[] args) {

        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        //重名时创建的对象是谁就优先用谁，没有才向上找
        zi.method();
    }
}
