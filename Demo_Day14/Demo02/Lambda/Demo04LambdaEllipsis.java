package Demo02.Lambda;

// 标准格式：(参数类型 参数名称) -> { 代码语句 }
// 省略写法的规则：
//      1. (参数列表) 小括号内参数的类型可以省略；
//      2. (参数列表) 如果小括号内有且仅有一个参，则小括号可以省略；
//      3. {代码语句} 如果大括号内有且仅有一个语句，则无论是否有返回值，
//              都可以省略大括号、return关键字及;（要省略必须一起省略）。

import java.util.ArrayList;

public class Demo04LambdaEllipsis {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
    }
}
