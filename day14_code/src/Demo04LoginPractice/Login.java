package Demo04LoginPractice;

import Demo03JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
    通过键盘录入用户名和密码。
    如果登录成功则提醒登陆成功。
    如果失败则提醒登录失败。
 */
public class Login {


    public static boolean login(String username, String passward) {
        if(username == null || passward == null) {
            return false;
        }

        try {
            Connection conn = JDBCUtils.getConnection();
            String sql = "select * from users where username = '" + username + "' and passward = '" + passward + "'";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            return res.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

}
