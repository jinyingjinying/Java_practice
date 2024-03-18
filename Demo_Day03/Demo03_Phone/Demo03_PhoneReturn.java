package Demo03_Phone;

public class Demo03_PhoneReturn {

    public static void main(String[] args) {
        Demo03_Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

    }

    //Demo03_Phone是返回值类型
    public static Demo03_Phone getPhone() {
        Demo03_Phone one = new Demo03_Phone();
        one.brand = "苹果";
        one.price = 8388;
        one.color = "土豪金";
        return one;
    }
}
