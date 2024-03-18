package Demo11_Array;

public class Demo01Array {

    // 对象数组
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one  = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 20);
        Person three = new Person("马尔扎哈", 32);

        // 将one, two, three的地址值赋值到array数组中
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        Person person = array[0];
        System.out.println(person.getName());//迪丽热巴

        System.out.println(array[0].getName());//迪丽热巴
    }
}
