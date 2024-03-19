package Demo11_Array;

// 用一个大集合存入20个随机数字，筛选其中的偶数元素放入小集合
// 使用自定义方法实现筛选

// 20个随机数字，大集合存储20次
// 自定义方法筛选：返回值是小集合ArrayList，方法名称getSmall-list，参数列表是大集合ArrayList


import java.util.ArrayList;
import java.util.Random;

public class Demo11_Test04 {

    public static void main(String[] args) {

        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }
        System.out.println(bigList);
        System.out.println(getSmall_list(bigList));
    }

    public static ArrayList<Integer> getSmall_list(ArrayList<Integer> bigList) {

        ArrayList<Integer> smallList = new ArrayList<>();

        for (int i = 0; i < bigList.size(); i++) {
            if (bigList.get(i) % 2 == 0) {
                smallList.add(bigList.get(i));
            }
        }
        return smallList;
    }
}
