package Demo03_Phone;

public class Demo03_TestPhone {

    public static void main(String[] args) {
        // 创建对象
        Demo03_Phone phone1 = new Demo03_Phone();

        System.out.println("brand " + phone1.brand);
        System.out.println("color " + phone1.color);
        System.out.println("price " + phone1.price);

        phone1.call("赵丽颖");
        phone1.sendMessage();

        // 创建第二个对象
        Demo03_Phone phone2 = new Demo03_Phone();
        System.out.println("brand " + phone2.brand);
        System.out.println("color " + phone2.color);
        System.out.println("price " + phone2.price);

        phone2.call("杨幂");
        phone2.sendMessage();

        // 将phone1中保存的对象地址值赋值给phone3
        Demo03_Phone phone3 = phone1;
    }
}
