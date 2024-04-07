package Demo02;

public class Demo01Throw {
    // throw 用在【方法内部】，用来抛出一个指定的异常对象，必须时Exception或其子类对象
    // throw 抛出指定的异常对象必须处理这个异常对象
    //      RuntimeException或其子类可以不处理
    // throw new 异常类名(参数);
    public static void main(String[] args) {
//        int[] arr = null;
//        int e = getElement(arr, 0);
        int[] arr = { 1, 2, 3 };
        int e = getElement(arr, -1);
        System.out.println(e);
    }

    // 首先对方法传递过来的参数进行合法性校验
    // 不合法时使用抛出异常的方式，告知方法的调用者
    public static int getElement(int[] arr, int index) {
        if (arr ==null) {
            throw new NullPointerException("传递的数组是null");
        }
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组索引越界异常");
        }
        int ele = arr[index];
        return ele;
    }
}
