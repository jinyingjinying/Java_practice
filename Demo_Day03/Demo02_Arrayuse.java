public class Demo02_Arrayuse {

    public static void main(String[] args) {
        //staarray();
        //dynarray();
        //traarray();
        //maxarray();
        //revarray();
        
        //int[] array = { 1, 2, 3, 4, 5 };
        //arrayparam(array);

        // result现在是数组，println得到的是地址
        int[] result = arrayreturn( 10, 20, 30 );
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private static int[] arrayreturn(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = { sum, avg };
        return array;
    }

    private static void arrayparam(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void revarray() {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    private static void maxarray() {
        int[] arr = { 5, 15, 2000, 10000, 100, 4000 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    private static void traarray() {
        int[] array = {15, 25, 35, 45, 55};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=======================");
    }

    private static void staarray() {
        int[] array = {10, 20, 30};

        //直接打印数组名称，输出的是数组对应的内存地址哈希值
        System.out.println(array);

        //数组名称[索引值]
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //打印或者赋值都可以
        int num = array[1];

        //获取数组长度
        System.out.println(array.length);

        //数组长度不能改变，new出来的是数组，前面是地址
        //两个new说明是两个数组
        int[] arrayc = new int[3];
        System.out.println(arrayc.length);
        System.out.println(arrayc);
        arrayc = new int[5];
        System.out.println(arrayc.length);
        System.out.println(arrayc);
        System.out.println("=======================");
    }

    private static void dynarray() {
        int[] array = new int[3];

        //赋值
        array[1] = 123;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println("=======================");
    }
}

