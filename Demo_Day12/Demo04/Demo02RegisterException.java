package Demo04;

import java.util.Scanner;

public class Demo02RegisterException {
    static String[] usernames = {"包包","拉拉","泡泡","趴趴"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username = sc.next();
        checkUsername(username);
    }
    public static void checkUsername(String username) {
        for (String name : usernames) {
            if(name.equals(username)) {
                try {
                    throw new RegisterException("该用户名已经被注册！");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;     //结束方法
                }
            }
        }
        System.out.println("注册成功！");
    }
}
