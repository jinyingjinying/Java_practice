package Demo06;

import java.util.ArrayList;

public class Manager extends User{

    public Manager() {
        // super();
    }

    public Manager (String name, int leftMoney) {
        super(name, leftMoney);
    }

    public ArrayList<Integer> send (int totalMoney, int count) {

        // 群主当前余额
        int leftMoney = super.getLeftMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return null;
        }

        System.out.println("可以派发红包");
        super.setLeftMoney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;

        ArrayList<Integer> redList = new ArrayList<>();
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
