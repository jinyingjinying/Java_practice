package Demo02;
// 含有泛型的接口
//      第1种使用方式：定义类时确定泛型的类型
//      修饰符 interface接口名<代表泛型的变量> {  }

public class GenericInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
