package Demo04Consumer;

/*
    java.util.function.Consumer<T> 接口
        默认方法：andThen：一个方法的参数和返回值全都是 Consumer 类型
 */

import java.util.function.Consumer;

public class Demo02AndThen {
    public static void consumeString (String str, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(str);
        /*
            相当于
            con1.accept(s);
            con2.accept(s);
            连接两个Consumer接口再进行消费
        */
    }

    public static void main(String[] args) {
        consumeString("Hello",
                // t是形参 方法中已经定义s会传进去
                (t) -> {System.out.println(t.toUpperCase());},  //HELLO
                (t) -> {System.out.println(t.toLowerCase());}); //hello
    }
}
