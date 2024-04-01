package Demo05;

/*
 基本类型--->String 总共有三种方式
    1.基本类型直接与""相连接
    2.包装类中的静态方法 static String toString(int i)
    3.String类中的静态方法 static String valueOf(int i)

 字符串--->基本类型
    包装类的静态方法parse,除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型：
    - `public static byte parseByte(String s)`：将字符串参数转换为对应的byte基本类型。
    - `public static short parseShort(String s)`：将字符串参数转换为对应的short基本类型。
    - `public static int parseInt(String s)`：将字符串参数转换为对应的int基本类型。
    - `public static long parseLong(String s)`：将字符串参数转换为对应的long基本类型。
    - `public static float parseFloat(String s)`：将字符串参数转换为对应的float基本类型。
    - `public static double parseDouble(String s)`：将字符串参数转换为对应的double基本类型。
    - `public static boolean parseBoolean(String s)`：将字符串参数转换为对应的boolean基本类型。
 */
public class Demo02WrapperParse {
    public static void main(String[] args) {

        //基本类型--->字符串
        String str1 = 100 + "";
        System.out.println(str1 + 200); // 100200

        String str2 = Integer.toString(100);
        System.out.println(str2 + 200); // 100200

        String str3 = String.valueOf(100);
        System.out.println(str3 + 200); // 100200

        //字符串--->基本类型
        int i = Integer.parseInt("100");
        System.out.println(i + 200);    // 300

        double d = Double.parseDouble("0.7865");
        System.out.println(d + 0.2987); // 1.0852

    }

}


