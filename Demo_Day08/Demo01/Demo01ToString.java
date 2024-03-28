package Demo01;

public class Demo01ToString {

    public static void main(String[] args) {
        Person p = new Person("包包",5);
        String s = p.toString();

        System.out.println(s);  //Demo01.Person@27d6c5e0
        System.out.println(p);  //Demo01.Person@27d6c5e0,其实就是p.toString()

        String str = "yeyeye";
        System.out.println(str);//yeyeye,String类中的toString方法是重写好的
        // System.out.println(str.toString()); 实际上是这个

        //重写toString方法的话打印的就不是地址值，默认是地址值没有意义

    }
}
