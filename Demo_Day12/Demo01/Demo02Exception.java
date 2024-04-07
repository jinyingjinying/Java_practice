package Demo01;

public class Demo02Exception {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        int e = getElement(array, 3);
        System.out.println(e);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //	at Demo01.Demo02Exception.getElement(Demo02Exception.java:11)
        //	at Demo01.Demo02Exception.main(Demo02Exception.java:6)
        // 产生异常的地方jvm创建一个异常对象，调用该方法时创建的异常对象交给main方法
        // main方法没有处理机制则交给jvm处理，jvm中断程序并在输出台输出相关信息
    }

    public static int getElement(int[] arr, int index) {
        int ele = arr[index];
        return ele;
    }
}
