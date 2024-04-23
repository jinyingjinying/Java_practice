package Demo04MethodReference.Demo03ObjectMethodRef;

/*
    通过对象名引用成员方法
    使用前提：对象名已经存在，成员方法也已经存在
 */

import Demo04MethodReference.Demo01Printable.Printable;

public class DemoObjectMethodReference {
    public static void printString(Printable p) {
        p.print("Hello!");
    }

    public static void main(String[] args) {
        // Lambda表达式
        printString( (s) -> {
            ObjectMethodReference obj = new ObjectMethodReference();
            obj.printUpperCaseString(s);
        } );

        // 通过对象名引用成员方法
        ObjectMethodReference obj = new ObjectMethodReference();
        printString(obj::printUpperCaseString);
    }
}
