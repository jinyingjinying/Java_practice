package Test;

/*计算一个字符串中每个字符出现次数。
    1.  Scanner获取一个输入得字符串对象
    2.  创建一个Map集合，键代表字符，值代表次数。
    3.  遍历字符串得到每个字符。
    4.  判断Map中是否有该键。
    5.  如果没有，第一次出现，存储次数为1；如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
    6.  打印最终结果
* */

import java.util.HashMap;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 1.  Scanner获取一个输入得字符串对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //  2.  创建一个Map集合，键代表字符，值代表次数。
        HashMap<Character, Integer> map = new HashMap<>();

        //  3.  遍历字符串得到每个字符。
        //  4.  判断Map中是否有该键。
        //  5.  如果没有，第一次出现，存储次数为1；如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
        for (char c : str.toCharArray()) {      //str.toCharArray()
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value ++;
                map.put(c,value);
            } else {
                map.put(c,1);
            }
        }

        //  6.  打印最终结果
        for (Character key: map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
