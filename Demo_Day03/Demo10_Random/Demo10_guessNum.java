package Demo10_Random;

import java.util.Random;
import java.util.Scanner;

public class Demo10_guessNum {

    public static void main(String[] args) {
        // 游戏开始时，会随机生成一个1-100之间的整数 number 。
        // 玩家猜测一个数字 guessNumber ，会与 number 作比较
        // 系统提示大了或者小了，直到玩家猜中，游戏结束

        // 产生一个随机数字，一旦产生不再变化 Random nextInt
        // 需要键盘输入 Scanner nextInt
        // 判断 大？（重试）小？（重试）猜中？（结束）
        // 次数不确定 所以是while（true）

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = r.nextInt(100) + 1; // 系统产生的随机数[1-100]

        // while（true） 代表不限次数
        while (true) {

            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();

            if (randomNum < guessNum) {
                System.out.println("太大啦！请重试");
            } else if (randomNum > guessNum) {
                System.out.println("太小啦！请重试");
            } else {
                System.out.println("猜中了！");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
