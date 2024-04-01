package Demo02;

// 泛型是一个未知的数据类型，当不确定使用什么数据类型的时候可以使用泛型
// 泛型可以接收任意的数据类型，创建对象的时候确定泛型的数据类型

public class Demo02GenericClass {

    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("只能传递字符串");

        // 不写泛型（E）默认是object类型
        Object obj = gc.getName();
        System.out.println(obj);        //只能传递字符串

        // 创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass();
        gc2.setName(2);
        Integer in = gc2.getName();     //2
        System.out.println(in);

        // 创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass();
        gc3.setName("abcd");
        String str = gc3.getName();     //abcd
        System.out.println(str);
    }
}
