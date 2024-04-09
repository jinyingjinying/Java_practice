package Demo02.LambdaTest;
// 给定一个计算器 Calculator 接口，
// 内含抽象方法 calc (减法)，
// 其功能是可以将两个数字进行相减，并返回差值。
// 使用Lambda表达式在Test05中完成调用

public class Test05 {
    public static void main(String[] args) {
        // TODO 请分别使用Lambda【标准格式】及【省略格式】
        //  调用invokeCalc方法来计算130-120的结果ß
        invokeCalc(130,120, (int a, int b) -> {
            return a - b;
        });
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
