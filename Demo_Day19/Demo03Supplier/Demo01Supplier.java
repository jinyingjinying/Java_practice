package Demo03Supplier;

/*
    java.util.function.Supplier<T> 接口仅包含一个无参的方法： T get() 。用来获取一个泛型参数指定类型的对象数据。
    由于这是一个函数式接口，这也就意味着对应的Lambda表达式需要“对外提供”一个符合泛型类型的对象数据。

    Supplier<T> 被称为生产型接口，指定接口的泛型是什么型，get方法就会生产什么型的数据
 */

import java.util.function.Supplier;

public class Demo01Supplier {
    // 定义一个方法，参数传递Supplier<T>接口
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        // 调用getString方法，方法的参数Supplier是一个函数式接口，传递Lambda表达式
        String str = getString(() -> {
            // 生产一个字符串并返回
            return "getString方法返回一个字符串";
        });
        System.out.println(str);
    }
}
