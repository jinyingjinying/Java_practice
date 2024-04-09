package Demo02.LambdaTest;

// 请使用Lambda的标准格式调用`invokeCook`方法，打印输出“吃饭啦！”字样：
public class Test01 {
    public static void main(String[] args) {
        // 传统格式
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦！");
            }
        });

        // TODO 请在此使用Lambda【标准格式】调用invokeCook方法
        invokeCook(() -> {
            System.out.println("吃饭啦！");
        });

        // TODO 省略lambda格式
        invokeCook( () -> System.out.println("吃饭啦！"));
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
