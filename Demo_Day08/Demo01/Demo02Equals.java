package Demo01;

public class Demo02Equals {

    public static void main(String[] args) {
        Person p1 = new Person("包包",3);
        Person p2 = new Person("包包",3);

        //默认比较的是地址值，需要比较内容的话需要覆盖重写
        //此处已完成方法重写
        boolean b1 = p1.equals(p2);
        System.out.println(b1);
    }
}
