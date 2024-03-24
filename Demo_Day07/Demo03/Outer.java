package Demo03;

public class Outer {

    public void methodOuter() {
        class Inner {
            int num = 10;
            public void methodInner() {
                System.out.println("内部方法");
                System.out.println(num); //10
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
