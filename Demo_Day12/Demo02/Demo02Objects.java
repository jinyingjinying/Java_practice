package Demo02;

import java.util.Objects;

public class Demo02Objects {
    public static void main(String[] args) {
        method(null);
    }
    public static void method( Object obj ) {
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递对象为空");
    }
}

