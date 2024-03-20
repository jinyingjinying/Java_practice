package Demo04;

public class Demo03Math {

    public static void main(String[] args) {

        System.out.println(Math.abs(-4.28));
        System.out.println(Math.ceil(-4.28));
        System.out.println(Math.floor(-4.28));
        System.out.println(Math.round(-4.28));
        System.out.println(Math.PI);

        System.out.println("==========================");

        // 请使用 Math 相关的API
        // 计算在 -10.8 到 5.9 之间
        // 绝对值大于 6 或者小于 2.1 的整数有多少个？

        double min = -10.8;
        double max = 5.9;
        int count1 = 0;
        int count2 = 0;

        // Math.ceil()的返回值是double型
        for (double i = Math.ceil(min); i <= max; i++) {
            if (Math.abs(i) < 2.1 || Math.abs(i) > 6) {
                count1 ++;
            }
        }
        System.out.println("符合要求的整数有" + count1 + "个");

        for (int i = (int) min; i < max; i++){
            if (Math.abs(i) < 2.1 || Math.abs(i) > 6) {
                count2 ++;
            }
        }
        System.out.println("符合要求的整数有" + count2 + "个");
    }
}
