package Demo06;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member() {
    }

    public Member(String name, int leftMoney) {
        super(name, leftMoney);
    }

    public void receive(ArrayList<Integer> list) {
        int index = new Random().nextInt(list.size());     //随机索引值
        int delta = list.remove(index);                    //返回值是被删除的元素
        int money = super.getLeftMoney();          //当前成员本来有多少钱
        super.setLeftMoney(money + delta);         //当前成员现在有多少钱
    }

}
