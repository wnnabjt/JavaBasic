package Demo07Exception.ImitateRegister;


import Demo07Exception.Demo09RegisterException;

import java.util.*;

public class Demo01ImitateRegister {

    public static void main(String[] args) {
        Set<String> usernames = new HashSet<>();
        Collections.addAll(usernames, "1", "2", "3", "4");
        String username;
        Scanner sc = new Scanner(System.in);
        while(true) {
            username = sc.next();
            if (usernames.contains(username)) {
                try {
                    throw new Demo09RegisterException("亲，该用户名已经被注册过了"); //不执行任何代码，直接抛出异常
                } catch (Demo09RegisterException e) {
                    e.printStackTrace();
                }
            } else {
                usernames.add(username);
                System.out.println("恭喜您注册成功！！！");
                break;
            }
        }
    }

}
