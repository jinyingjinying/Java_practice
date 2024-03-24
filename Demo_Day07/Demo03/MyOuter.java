package Demo03;

public class MyOuter {

    public void methodOuter() {
        int num = 10; //所在方法的局部变量
        // num不可变！！！！
        final int num2 = 20;

        class MyInner { //局部内部类
            public void methodInner() {
                System.out.println(num);
                System.out.println(num2);
            }
        }

        
    }
}
