package Demo02;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method01(10);
        gm.method01("abcd");
        gm.method01(true);

        gm.method02("静态方法不建议创建对象使用");
        // 静态方法，通过类名.方法名（参数）可以直接使用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);
    }
}
