package Demo03;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {

        // 1. 准备牌
        // 定义一个存储54张牌的ArrayList集合，String泛型
        ArrayList<String> poker = new ArrayList<>();
        // 定义两个数组，分别存储花色和序号
        String[] colors = { "♠", "♣", "♥", "♦" };
        String[] numbers = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };
        // 大王小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        // 循环嵌套遍历两个数组，组装52张牌
        for (String number: numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }

        // 2. 洗牌
        Collections.shuffle(poker);

        // 3. 发牌
        // 定义4个集合存储3个玩家的牌和3张底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> remain = new ArrayList<>();
        // 遍历poker集合，获取所有牌面
        // 索引%3，分别给3个玩家轮流发牌，剩余3张给remain
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if (i >= 51) {
                remain.add(s);
            } else {
                if (i % 3 == 0) {
                    player01.add(s);
                }
                if (i % 3 == 1) {
                    player02.add(s);
                }
                if (i % 3 == 2) {
                    player03.add(s);
                }
            }
        }

        // 4. 输出
        System.out.println("包包的牌为" + player01);
        System.out.println("拉拉的牌为" + player02);
        System.out.println("芝麻的牌为" + player03);
        System.out.println("底牌为" + remain);


    }
}
