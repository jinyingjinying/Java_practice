package Demo03;

//父类异常是什么样，子类异常就是什么样

public class Fu {
    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}
}

class Zi extends Fu {
    //如果父类抛出了多个异常，子类重写父类方法时,抛出和父类相同的异常
    public void show01() throws NullPointerException, ClassCastException{}
    //如果父类抛出了多个异常，子类重写父类方法时,抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //如果父类抛出了多个异常，子类重写父类方法时,不抛出异常

    public void show03(){}
    //父类没有抛出异常时，子类重写父类方法也不可以抛出异常
    //此时子类产生该异常，只能捕获处理，不能声明抛出
    public void show04() {
        try {
            throw new Exception("只能通过捕获来抛出异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
