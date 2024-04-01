package Demo04;

import java.util.Arrays;

public class Demo01System {

    public static void main(String[] args) {

        // 验证for循环打印数字1-9999所需要使用的时间（毫秒）
        demo01();       // 程序共耗时368毫秒

        // 将src数组中前3个元素，复制到dest数组的前3个位置上
        // 复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
        // 复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
        demo02();       // 复制前：[6, 7, 8, 9, 10]
                        // 复制后：[1, 2, 3, 9, 10]
    }

    // currentTimeMillis方法
    // 获取当前系统时间与1970年01月01日00:00点之间的毫秒差值
    public static void demo01() {       //System.currentTimeMillis
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序共耗时" + (end-start) + "毫秒");
    }

    // public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    // 将数组中指定的数据拷贝到另一个数组中
    public static void demo02() {       //System.arraycopy
        //定义原数组
        int[] src = { 1, 2, 3, 4, 5 };
        int[] dest = { 6, 7, 8, 9, 10 };
        System.out.println("复制前：" + Arrays.toString(dest));
        //System.arraycopy
        System.arraycopy(src,0, dest,0, 3);
        System.out.println("复制后：" + Arrays.toString(dest));
    }
}
