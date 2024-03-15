public class DemoDataType {
    public static void main(String[] args){
        long num1 = 100L;
        System.out.println(num1);

        // int --> long, num2自动转换为long类型,
        long num2 = 100;
        System.out.println(num2);

        // float --> double, num3自动转换为double
        double num3 = 2.5F;
        System.out.println(num3);

        // long --> float, float范围更大，自动转换为float
        float num4 = 30L;
        System.out.println(num4);

        System.out.println("=============");

        // long --> int 不是从小到大 不能自动转换
        // int num = 100L; 报错

        // 把100L强制转换为int，再赋值
        int num = (int) 100L;
        System.out.println(num);

        // long强制转换为int 数据溢出
        int num5 = (int) 6000000000L;
        System.out.println(num5); //1705032704

        // float强制转换为int 精度损失
        int num6 = (int) 3.5;
        System.out.println(num6); //3

        // byte/short/char都可以发生数学运算 +，-
        char char1 = 'A';
        System.out.println(char1+1); //66

        // result1是int型
        byte num7 = 40;
        byte num8 = 50;
        // byte result1 = (byte)(num7 + num8);
        int result1 = num7+num8;
        System.out.println(result1);



    }
}
