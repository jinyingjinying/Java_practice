package Demo04MethodReference.Demo01Printable;

public class DemoPrintable {
    // 定义一个方法，参数传递接口，对字符串进行打印
    public static void printString(Printable p) {
        p.print("Hello World!");
    }

    public static void main(String[] args) {
        // 调用printString方法，方法的参数是一个函数式接口
        printString(s-> System.out.println(s));
        printString(System.out::println);
        // 函数式编程的特点：函数可以作为值传递
    }
}
