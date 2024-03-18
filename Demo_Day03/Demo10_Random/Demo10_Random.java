package Demo10_Random;

import java.util.Random;

public class Demo10_Random {

    public static void main(String[] args) {
        Random r = new Random();

        //int所有范围，有正负两种
        int i = r.nextInt();
        //0到9之间的int型随机数，[0,10)左闭右开区间
        int j = r.nextInt(10);
        System.out.println(i);
        System.out.println(j);

        // [1,n]左闭右闭区间,实际是[1,n+1)
        int n = 5;
        // 20次随机数，范围是[1,n+1)
        for (int i1 = 0; i1 < 20; i1++) {
            int k = r.nextInt(n) + 1;
            System.out.println(k);
        }
    }
}
