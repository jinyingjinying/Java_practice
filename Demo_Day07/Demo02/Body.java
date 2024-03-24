package Demo02;

import org.w3c.dom.ls.LSOutput;

public class Body {

    public class Heart{   //成员内部类
        public void beat() {
            System.out.println("heart beat~~~~");
            // System.out.println(name);//body里可以访问private内容
        }
    }

    //外部类的成员变量
    private String name;

    public void methodBody() {
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
        // new Heart().beat();
        // 外部类方法中使用内部类
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
