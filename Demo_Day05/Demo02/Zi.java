package Demo02;

public class Zi extends Fu {

    int numZi = 20;
    int num = 200;

    public void methodZi() {
        int num = 300;
        System.out.println(num);       //300
        System.out.println(super.num); //100
        System.out.println(this.num);  //200
        System.out.println("===============");
    }

    // 覆盖重写,检测
    @Override
    public String method() {
        return null;
    }
}
