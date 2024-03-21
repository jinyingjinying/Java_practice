package Demo06;

import java.util.ArrayList;

public class MainRedPaket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member member1 = new Member("成员1", 10);
        Member member2 = new Member("成员2", 15);
        Member member3 = new Member("成员3", 20);

        manager.show();
        member1.show();
        member2.show();
        member3.show();

        System.out.println("====================");

        ArrayList<Integer> redList = manager.send(20,3);
        System.out.println(redList.size());
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);

        manager.show();
        member1.show();
        member2.show();
        member3.show();

        System.out.println("=====================");

    }
}
