package Demo03Supplier;

/*
    使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
    提示：接口的泛型请使用java.lang.Integer 类。
 */

import java.util.function.Supplier;

public class Demo02SupplierTest {
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 3, 6, 333, 22, 55};
        int max = getMax(() -> {
            int maxtemp = 0;
            for (int i : arr) {
                if (i > maxtemp) {
                    maxtemp = i;
                }
            }
            return maxtemp;
        });
        System.out.println(max);
    }
}
