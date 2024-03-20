package Demo02;

public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);

        Zi zi = new Zi();
        //不重名时访问没问题
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);

        System.out.println("==================");

        // 直接通过子类对象访问成员变量
        // 等号左边是谁就用谁，没有就向上找
        System.out.println(zi.num);//优先zi类200
        System.out.println("==================");

        // 间接通过成员方法访问成员变量
        zi.methodZi();//方法是子类的，200
        zi.methodFu();//方法是父类的，100

    }
}
