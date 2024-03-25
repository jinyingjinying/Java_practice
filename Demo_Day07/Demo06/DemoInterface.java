package Demo06;

import java.util.ArrayList;
import java.util.List;

// java.util.List是ArrayList实现的接口

public class DemoInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //左父右子，多态
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));  //集合的遍历
        }
    }

    // 接口作为返回值和参数
    // 进来一个空集合，返回值出去
    public static List<String> addNames(List<String> list) {
        list.add("包包");
        list.add("芝麻");
        list.add("小美");
        return list;
    }
}
