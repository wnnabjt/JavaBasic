package Demo01JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo04CreateTable {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "create table stu (id int, name varchar(20));";
            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "wnnnggabjt123@");
            stat = conn.createStatement();
            int i = stat.executeUpdate(sql);
            System.out.println(i);
        } catch (ClassNotFoundException e) {             e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if(stat != null) {
                    stat.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
