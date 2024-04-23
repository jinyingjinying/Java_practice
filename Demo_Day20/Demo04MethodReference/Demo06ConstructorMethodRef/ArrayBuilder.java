package Demo04MethodReference.Demo06ConstructorMethodRef;
@FunctionalInterface
public interface ArrayBuilder {
    // 定义一个创建int类型数组的方法，
    // 参数传递数组的长度，返回创建好的数组
    int[] buildArray(int length);
}
