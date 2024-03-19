package Demo11_Array;

import java.util.ArrayList;
import java.util.Random;

public class Demo11_Test01 {

    public static void main(String[] args) {
        //生成6个1-33的随机整数，添加到集合，并遍历集合

        // 构造方法
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int r = random.nextInt(33) + 1;
            list.add(r);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
