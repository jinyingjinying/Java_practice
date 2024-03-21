package Demo06;

public class User {
    private String name;
    private int leftMoney;

    public void show() {
        System.out.println(name + "的余额为：" + leftMoney + "元");
    }

    public User() {
    }

    public User(String name, int leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int money) {
        this.leftMoney = money;
    }
}
