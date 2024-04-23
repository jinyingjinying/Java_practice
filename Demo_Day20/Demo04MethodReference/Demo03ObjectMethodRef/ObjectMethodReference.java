package Demo04MethodReference.Demo03ObjectMethodRef;


public class ObjectMethodReference {
    // 定义一个成员方法，传递字符串，按照大写输出
    // 这里如果写成静态方法，则无法通过对象名引用成员方法
    // 静态方法要通过类名称进行引用
    public void printUpperCaseString(String str) {
        System.out.println(str.toUpperCase());
    }
}
