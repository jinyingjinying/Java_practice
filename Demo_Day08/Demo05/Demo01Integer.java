package Demo05;

import java.util.ArrayList;

public class Demo01Integer {
    // 如果想要我们的基本类型像对象一样操作，就可以使用基本类型对应的包装类
    // 基本类型与对应的包装类对象之间，来回转换的过程称为“装箱”与“拆箱”：

    public static void main(String[] args) {

        // 构造方法装箱，过时
        Integer in1 = new Integer(1);
        Integer in2 = new Integer("1");
        System.out.println(in1);
        System.out.println(in2);

        // 静态方法装箱
        Integer in3 = Integer.valueOf(1);
        Integer in4 = Integer.valueOf("1");
        System.out.println(in3);
        System.out.println(in4);

        // 自动装箱（自动方法）
        Integer in = 1;        // 自动装箱。相当于Integer in = Integer.valueOf(4);
        in += 3;               // 等号右边：将in对象转成基本数值(自动拆箱) in.intValue() + 5;
                               // 加法运算完成后，再次装箱，把基本数值转成对象。
        System.out.println(in);

        // ArrayList集合无法直接存储整数，但是可以存储Integer包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        // 拆箱
        int i = in1.intValue();
        System.out.println(i);
    }
}
