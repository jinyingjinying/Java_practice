package Demo02.LambdaTest;
// 给定一个导演 Director接口，
// 内含唯一的抽象方法makeMovie，且无参数、无返回值，
// 使用lambda表达式在Test04中完成调用。

public class Test04 {
    public static void main(String[] args) {
        // TODO 请使用Lambda【省略格式】调用invokeDirect方法
        //  打印输出“导演拍电影啦！”字样
        invokeDirect( () -> System.out.println("导演拍电影啦！"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }

}
