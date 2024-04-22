package Demo04Consumer;

/*
    下面的字符串数组当中存有多条信息，
    请按照格式“ 姓名：XX。性别：XX。 ”的格式将信息打印出来。
    要求将打印姓名的动作作为第一个 Consumer 接口的Lambda实例，
    将打印性别的动作作为第二个 Consumer 接口的Lambda实例，
    将两个 Consumer 接口按照顺序“拼接”到一起。
 */

import java.util.function.Consumer;

public class Demo03ConsumerTest {
    public static void print(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String str : arr) {
            con1.andThen(con2).accept(str);
        }
    }

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
        print( array,
                (t) -> {System.out.print("姓名：" + t.split(",")[0] + "，");},
                (t) -> {System.out.println("性别：" + t.split(",")[1]);});
    }
}
