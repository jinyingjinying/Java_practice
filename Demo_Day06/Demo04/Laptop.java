package Demo04;

public class Laptop {

    public void powerOn() {
        System.out.println("Laptop Power on!");
    }

    public void powerOff() {
        System.out.println("Laptop Power off!");
    }

    public void useDevice(USB usb) {
        usb.open();  //打开设备

        // 利用 【instanceof 关键字】 向下转型，调用特有方法
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }

        usb.close(); //关闭设备

    }
}
