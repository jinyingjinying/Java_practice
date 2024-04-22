package Demo02Lambda;

public class Demo02Lambda {
    // 定义一个显示日志的方法，参数传递日志等级和MessageBuilder接口
    public static void showLog(int level, MessageBuilder mb) {
        // 对等级进行判断
        if(level == 1) {
            System.out.println(mb.buildMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用showLog方法，参数MessageBuilder是一个函数式接口，可以传递Lambda表达式
        showLog(1, () -> {
            //返回一个拼接好的字符串
            return msg1 + msg2 + msg3;
        } );

        /*
            使用Lambda表达式作为参数传递，仅仅是把参数传递到showLog方法中
            只有满足条件即日志的等级是1，才会调用接口MessageBuilder中的BuildMessage方法，进行字符串的拼接
         */
    }
}
