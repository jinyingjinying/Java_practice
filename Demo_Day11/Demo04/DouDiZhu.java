package Demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
    有序版本斗地主
    1. 准备牌
        定义两个数组，分别存储花色和序号
        List<String> colors = List.Of("♠","♣","♥","♦");
        List<String> numbers = List.Of("2","A",..."K","3");
        Map<Integer, String>
        List<Integer>
    2. 洗牌
        Collections.shuffle(List);

    3. 发牌 ( i >= 51)
       index % 3 == 0;
       index % 3 == 1;
       index % 3 == 2;

    4. 排序
        Collections.sort(List)

    5. 看牌
        查表法：遍历一个集合获取另一个集合的key，通过key查找value
        遍历玩家和底牌的List集合，获取到Map集合给key，通过key找到value值

*/
public class DouDiZhu {
    public static void main(String[] args) {

        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♠", "♣", "♥", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index ++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index ++;

        for (String color: colors) {
            for( String number: numbers) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index ++;
            }
        }
        System.out.println(poker);
        System.out.println(pokerIndex);

        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);

        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> remain = new ArrayList<>();

        for( int i : pokerIndex) {
            Integer in = pokerIndex.get(i);
            if (i >= 51) {
                remain.add(in);
            } else if ( i % 3 == 0) {
                player01.add(in);
            } else if ( i % 3 == 1) {
                player02.add(in);
            } else if ( i % 3 == 2) {
                player03.add(in);
            }
        }

        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(remain);

        //定义一个看牌的方法
        show("包包", poker, player01);
        show("拉拉", poker, player02);
        show("仔仔", poker, player03);
        show("剩余的牌", poker, remain);
    }

    public static void show(String name, HashMap<Integer, String> map, ArrayList<Integer> list) {
        System.out.print(name + "：");
        ArrayList<String> al = new ArrayList<>();
        for (Integer i: list) {
            al.add(map.get(i));
        }
        System.out.println(al);
    }
}
