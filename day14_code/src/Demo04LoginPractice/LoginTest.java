package Demo04LoginPractice;

import java.util.Scanner;

public class LoginTest {

    public static void main(String[] args) {
        String username, passward;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        username = sc.next();
        System.out.println("请输入密码");
        passward = sc.next();
//        if(Login.login(username,passward)) {
        if(PreparedStatementImplementLogin.login(username,passward)) {
            System.out.println("登陆成功");
        } else {
            System.out.println("用户名或密码错误");
        }
    }

}
