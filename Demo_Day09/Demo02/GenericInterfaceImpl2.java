package Demo02;
// 含有泛型的接口
//      第2种使用方式：接口使用什么泛型，实现类就是用什么泛型，类跟着接口走
//      相当于定义了一个含有泛型的类，【创建对象的时候确定泛型的类型】
//      修饰符 interface接口名<代表泛型的变量> {  }

public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
