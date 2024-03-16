public class Demo02_Overload {

    public static void main(String[] args) {
        byte i1 = 10, i2 = 20;
        short i3 = 10, i4 = 20;
        int i5 = 10, i6 = 20;
        long i7 = 10, i8 = 20;
        System.out.println("byte " + isSame(i1, i2));
        System.out.println("short " + isSame(i3, i4));
        System.out.println("int " + isSame(i5, i6));
        System.out.println("long " + isSame(i7, i8));

    }

    public static boolean isSame(byte a, byte b) {
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        return a == b;
    }

    public static boolean isSame (int a, int b) {
        return a == b;
    }

    public static boolean isSame (long a, long b) {
        return a == b;
    }
}
