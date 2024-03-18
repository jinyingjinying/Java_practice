package Demo03_Phone;

public class Demo03_PhoneParam {

    public static void main(String[] args) {
        Demo03_Phone one = new Demo03_Phone();
        one.brand = "苹果";
        one.price = 8388;
        one.color = "土豪金";

        method(one);
    }

    public static void method(Demo03_Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
