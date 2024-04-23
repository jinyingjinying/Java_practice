package Demo04MethodReference.Demo06ConstructorMethodRef;

public class Demo02ArrayBuilder {
    // 定义一个方法，参数传递创建数组的长度和ArrayBuilder接口
    // 方法内部创建数组并返回
    public static int[] createArray(int length, ArrayBuilder ab) {
        return ab.buildArray(length);
    }

    public static void main(String[] args) {
        createArray(10, (l) -> new int[l]);
        createArray(10, int[]::new);
    }
}
