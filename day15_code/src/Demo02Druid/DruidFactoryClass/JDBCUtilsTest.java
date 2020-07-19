package Demo02Druid.DruidFactoryClass;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtilsTest {

    public static void main(String[] args) {
        DataSource ds = JDBCUtils.getConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = ds.getConnection();
            String sql = "insert into account values(null, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 1000);
            ps.setString(2, "wangwu");
            int i = ps.executeUpdate();
            System.out.println(i);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(ps, conn);
        }
    }

}
