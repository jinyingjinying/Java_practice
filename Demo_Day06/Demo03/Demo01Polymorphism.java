package Demo03;

public class Demo01Polymorphism {

    public static void main(String[] args) {

        //左侧父类的引用指向右侧子类的对象 【多态】
        kid obj = new son();

        obj.method();  //son 方法
        obj.methodKid();//kid only

        //20 成员变量优先调用父类
        System.out.println(obj.num);

        //父类中没有age，子类中有也调不到
        //System.out.println(obj.age);

        //但是可以向下转型
        System.out.println( ((son) obj).age );

        //20 通过成员方法调用了父类中的成员变量
        //10 通过覆盖重写调用了子类中的成员变量
        //方法属于谁就优先用谁，没有就向上找
        obj.showNum();

        // obj变量为fu型，找不到zi中的方法
        // 如果是 son obj = new son();就可以访问obj.methodZi()了
        // 向下转型
        ((son)obj).methodSon(); //son only

        System.out.println("============================");

        kid kid = new daughter();
        kid.method();  //daughter方法

        daughter kid1 = new daughter();
        getKid (kid1); //daughter方法
    }


    public static void getKid (kid kid1) {

        if ( kid1 instanceof son) {
            son son = (son) kid1;
            son.method();
        }
        if ( kid1 instanceof daughter) {
            daughter daughter = (daughter) kid1;
            daughter.method();
        }

    }
}
