package Demo04MethodReference.Demo05ThisMethodRef;

/*
    通过this关键字引用本类的成员方法
 */

public class Husband {
    public void buyHouse() {
        System.out.println("北京二环四合院");
    }
    public void marriage(Richable r) {
        r.buy();
    }
    public void soHappy() {
        marriage(() -> {
            this.buyHouse();
        });

        marriage(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
