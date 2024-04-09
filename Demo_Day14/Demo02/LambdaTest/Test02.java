package Demo02.LambdaTest;

// 在下面的代码中，请使用Lambda的标准格式调用invokeCalc方法，
// 完成120和130的相加计算：

public class Test02 {
    public static void main(String[] args) {
        // TODO 请在此使用Lambda【标准格式】
        //  调用invokeCalc方法来计算120+130的结果ß
        invokeCalc(120,130,(int a, int b) -> {
            return a + b;
        } );

        invokeCalc(120, 130, (a, b) -> a + b);

        //传统写法
        invokeCalc(120,130, new Calculator() {
            @Override
            public int calc(int a, int b) { //重写calc方法
                return a + b;
            }
        });
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        //调用接口，重写抽象方法
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
