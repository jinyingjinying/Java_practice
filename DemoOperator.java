public class DemoOperator {
    public static void main(String[] args){
        int x = 10;
        int y = 3;
        int result1 = x / y;
        int result2 = x % y;
        System.out.println(result1);
        System.out.println(result2);

        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1+str2);//HelloWorld
        System.out.println(str1+20+30);//Hello2030
        System.out.println(str1+(20+30));//Hello50

        int num1 = 10;
        System.out.println(++num1); //11
        System.out.println(num1); //11

        int num2 = 10;
        System.out.println(num2++);//10
        System.out.println(num2);//11

        int num3 = 10;
        int result3 = --num3;
        System.out.println(result3);//9
        System.out.println(num3);//9

        int num4 = 10;
        int result4 = num4--;
        System.out.println(result4);//10
        System.out.println(num4);//9

        int X = 10;
        int Y = 20;
        int result5 = ++X + Y--;
        System.out.println(result5);//31
        System.out.println(X);//11
        System.out.println(Y);//19

        byte num = 30;
        // num = num + 5
        // num = byte + int
        // num = int + int
        // num = int
        // *** num = (byte) int
        num += 500;
        System.out.println(num);//18

        System.out.println(10 > 5);//true

        System.out.println(3 < 4 && 10 > 5);//true

        int a = 10;
        System.out.println(3 > 4 && ++a <100);//false
        System.out.println(a);//10 ++a不执行

        int i = 10;
        int j = 20;
        int max = i > j ? i : j;
        System.out.println(max);

    }
}
