package Demo04;

public class Demo02StringBuilder {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        // public String toString()：将当前StringBuilder对象转换为String对象。
        // StringBuilder已经覆盖重写了Object当中的toString方法。
        StringBuilder sb = new StringBuilder("Hello ").append("World ").append("Java");
        String str = sb.toString();
        System.out.println(str);        //Hello World Java
    }

    private static void demo02() {
        // public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
        // append方法具有多种重载形式，可以接收任意类型的参数。
        // 任何数据作为参数都会将对应的字符串内容添加到StringBuilder中。
        // append返回的是this
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1.append("Hello");
        System.out.println(sb1);        // Hello
        System.out.println(sb2);        // Hello
        System.out.println(sb1 == sb2); // true

        sb2.append(" World ");
        sb2.append(true);
        sb2.append(100);
        System.out.println(sb1);        // Hello World true100

        // 链式编程，方法的返回值是一个对象，可以根据对象继续调用方法
        sb2.append(" again ").append(false).append(0.8675).append('中');
        System.out.println(sb1);        // Hello World true100 again false0.8675中
    }

    private static void demo01() {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);        // 空
        StringBuilder sb2 = new StringBuilder("Hello World!");
        System.out.println(sb2);        // Hello World!
    }
}
