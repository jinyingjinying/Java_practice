package Demo03;

import java.util.ArrayList;
import java.util.List;

public class Demo01MultiException {
    public static void main(String[] args) {

//      1. 多个异常分别处理，即多个try catch
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);      //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }
        try {
            List<String> list = new ArrayList<>(10);
            list.set(1,"new value");
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);      //java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
        }
        System.out.println("后续代码继续执行");
        System.out.println("--------------------------");

//      2. 多个异常一次捕获，多次处理 一次只能捕获一个，必须是不同类型
        try {
            int[] arr = { 1, 2, 3 };
//            System.out.println(arr[3]);
            List<String> list = new ArrayList<>(10);
            list.set(1,"new value");
        } catch (ArrayIndexOutOfBoundsException e) {    //子类异常写在上面
            System.out.println(e);                      //     java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        } catch (IndexOutOfBoundsException e) {         //父类异常写在下面
            System.out.println(e);                      //     java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
        }

//      3. 多个异常一次捕获一次处理 一次可以捕获多个同类型
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[3]);
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);                      //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
                                                        //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }
    }
}
