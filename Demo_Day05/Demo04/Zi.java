package Demo04;

public class Zi extends Fu {

    public Zi() {
        //super();赠送的一定是无参的
        super(10);//调用父类重载的调用方法,必须是第一句
        System.out.println("子类构造方法");
    }


}
