package Demo04Consumer;

/*
//    java.util.function.Consumer<T> 接口则正好与Supplier接口相反
    它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
        抽象方法 void accept(T t) ，意为消费一个指定泛型的数据
 */

import java.util.function.Consumer;

public class Demo01Consumer {
    public static void consumeString(String name, Consumer<String> cons) {
        cons.accept(name);
    }

    public static void main(String[] args) {
        consumeString("拉拉和包包", (name)->{
            System.out.println(name);   //拉拉和包包
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName); //包包和拉拉
        });
    }
}
