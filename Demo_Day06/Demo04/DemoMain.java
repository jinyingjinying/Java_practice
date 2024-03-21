package Demo04;

public class DemoMain {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        //多态写法
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();

        laptop.powerOn();               // Laptop Power on!
        laptop.useDevice(mouse);        // Mouse open! Mouse only click! Mouse close!
        laptop.useDevice(keyboard);     // Keyboard open! Keyboard only tap! Keyboard close!

        //非多态写法，此处自动发生向上转型
        Mouse mouse1 = new Mouse();
        Keyboard keyboard1 = new Keyboard();
        laptop.useDevice(mouse1);       // Mouse open! Mouse only click! Mouse close!
        laptop.useDevice(keyboard1);    // Keyboard open! Keyboard only tap! Keyboard close!

        laptop.powerOff();              // Laptop Power off!

    }
}
