package Demo02;

public class Demo01InnerClass {

    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("=======================");

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
