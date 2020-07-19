package Demo04LoginPractice;

import Demo03JDBCUtils.JDBCUtils;

import java.sql.*;

public class PreparedStatementImplementLogin {

    public static boolean login(String username, String passward) {
        if(username == null || passward == null) {
            return false;
        }

        try {
            Connection conn = JDBCUtils.getConnection();
            String sql = "select * from users where username = ? and passward = ?";
            PreparedStatement prestat = conn.prepareStatement(sql);
            prestat.setString(1, username);
            prestat.setString(2, passward);
            ResultSet res = prestat.executeQuery();
            return res.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

}
