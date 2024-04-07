package Demo03;

public class Demo02Finally {

    // 如果finally有return语句,永远返回finally中的结果!!!
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);      //100
    }
    public static int getA() {
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            a = 100;
            return a;
        }
    }
}
