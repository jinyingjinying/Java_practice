package Demo02.LambdaTest;

//在指定位置插入代码实现打印输出1-99

public class Test03 {
    public int start = 1;
    public int end = 99;

    public static void main(String[] args) {
        new Test03().method();
    }
    public void method() {
        //请在此处插入代码，实现功能
        Runnable a = ( () -> {  //所以只能用创建对象的方法
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        } );

        Thread t = new Thread(a);   //明确传这个参数
        t.start();
    }
}
