package Demo02;

// 泛型是一个未知的数据类型，当不确定使用什么数据类型的时候可以使用泛型
// 泛型可以接收任意的数据类型，创建对象的时候确定泛型的数据类型

public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
