package Demo03;

public class NewPhone extends Phone {
    @Override
    public void show(){
        super.show();//把旧方法重复利用
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
