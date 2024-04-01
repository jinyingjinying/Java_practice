package Demo02;

// 定义含有泛型的方法：定义再方法的修饰符和返回值类型之间
// 修饰符 <代表泛型的变量> 返回值类型 方法名(参数列表（使用泛型){  }
// 含有泛型的方法，在调用方法的时候确定泛型的数据类型
// 传递什么类型的参数，泛型就是什么类型

public class GenericMethod {
    public <M> void method01(M m) {
        System.out.println(m);
    }

    public static <S> void method02(S s) {
        System.out.println(s);
    }
}
