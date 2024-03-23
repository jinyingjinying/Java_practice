package Demo02;

public class Demo06StringPractice {

    public static void main(String[] args) {

        // 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。
        // 格式参照如下：[word1#word2#word3]

        // 1. 定义一个数组{1,2,3}
        // 2. 定义一个方法把数组变成字符串
        // 3. 方法三要素 返回值类型是字符串，方法名称，参数列表是数组

        int[] array = { 1, 2, 3 };
        System.out.println(fromArrayToString(array));
    }

    public static String fromArrayToString(int[] array){

        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }

}
