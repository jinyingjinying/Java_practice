public class DemoProcessControl {
    public static void main(String[] args){
        Sequence();
        If();
        IfElse();
        IfElseExt();
        Score();
        Three();
        Switch();
        For();
        While();
        DoWhile();
        HundredSum();
        Break();
        Continue();
        Loop();
    }

    private static void Loop() {
        for(int hour = 0; hour < 24; hour++){
            for(int min = 0; min < 60; min++){
                System.out.println(hour + "点" + min + "分");
            }
        }
    }

    private static void Continue() {
        for (int i = 1; i <= 10; i++){
            if (i == 4){
                continue;//跳过4层继续后面
            }
            System.out.println(i+"层到了。");
        }
        System.out.println("=====================");
    }

    private static void Break() {
        for (int i = 1; i <= 10; i++){
            if (i == 4){
                break;//4往后都没了
            }
            System.out.println("Hello" + i);
        }
        System.out.println("=====================");

    }

    private static void HundredSum() {
        // 1-100所有偶数和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 ==0) {
                sum += i;
            }
        }
        System.out.println("1-100偶数和为" + sum);
        System.out.println("=====================");
    }

    private static void DoWhile() {
        int i = 1;
        do { //dowhile循环一定无脑执行一次
            System.out.println("名字"+i);
            i++;
        } while (i <= 10);
        System.out.println("=====================");
    }

    private static void While() {
        int i = 1;
        while (i <= 10) {
            System.out.println("名字"+i);
            i++;
        }
        System.out.println("=====================");
    }

    private static void For() {
        for (int i = 1; i <= 10; i++){
            System.out.println("名字"+i);
        }
        System.out.println("=====================");
    }

    private static void Switch() {
        int week = 5;
        switch (week) {
            case 1:
                System.out.println("星期1");
                break;
            case 2:
                System.out.println("星期2");
                break;
            case 3:
                System.out.println("星期3");
                break;
            case 4:
                System.out.println("星期4");
                break;
            case 5:
                System.out.println("星期5");
                break;
            case 6:
                System.out.println("星期6");
                break;
            case 7:
                System.out.println("星期7");
                break;
            default:
                System.out.println("unknown");
                break;
        }
        System.out.println("=====================");
    }

    private static void Three() {
        int a = 10;
        int b = 20;
        int max1 = a > b ? a : b;
        System.out.println("最大值是：" + max1);

        int max2;
        if(a > b){
            max2 = a;
        } else {
            max2 = b;
        }
        System.out.println("最大值是：" + max2);
        System.out.println("=====================");
    }

    private static void Score() {
        int score = 55;
        if (score <0 || score >100) {
            System.out.println("成绩有误");
        } else if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("好");
        } else if (score >= 70) {
            System.out.println("良");
        } else if (score >= 60) {
            System.out.println("及格");
        } else if (score >= 0) {
            System.out.println("不及格");
        } else {
            System.out.println("成绩有误");
        }
        System.out.println("=====================");
    }

    private static void IfElseExt() {
        int x = 10;
        int y;
        if (x >= 3){
            y = 2 * x + 1;
        } else if (x > -1){
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println(y);
        System.out.println("=====================");
    }

    private static void IfElse() {
        int num = 100;
        if (num % 2 ==0) {
            System.out.println("偶数！");
        } else {
            System.out.println("奇数！");
        }
        System.out.println("=====================");
    }

    private static void If() {
        System.out.println("start!");
        int age = 16;
        if (age >= 18){
            System.out.println("come in");
        }
        System.out.println("cannot in");
        System.out.println("=====================");
    }

    private static void Sequence() {
        System.out.println("nice weather!");
        System.out.println("sunny and warm");
        System.out.println("let's hang out");
        System.out.println("=====================");
    }


}
