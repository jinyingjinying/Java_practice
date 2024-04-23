package Demo04MethodReference.Demo02StaticMethodRef;

/*
    通过类名称引用静态方法
 */

public class DemoStaticMethodReference {
    public static int method(int num, Calculable c) {
        return c.calc(num);
    }

    public static void main(String[] args) {
        int num = method(-10, i -> Math.abs(i));
        System.out.println(num);

        // 使用方法引用
        System.out.println(method(-20, Math::abs));
    }
}
