public class DemoVariableNotice {
    public static void main(String[] args){
        /*float和long不要忘记字母后缀F和L
        byte和short类型变量，不能超过取值范围
        没有赋值的变量不能使用
        变量使用不能超过作用域的范围（创建前不能使用）
        【作用域】从定义变量的一行开始到所属大括号结束
        */
        int num1 = 100;
        System.out.println(num1);
        {
            int num2 = 200;
            System.out.println(num2);
        }
        int num2 = 300;
        System.out.println(num2);
        int a = 1, b = 2, c = 3;
        System.out.println(a);
    }
}
