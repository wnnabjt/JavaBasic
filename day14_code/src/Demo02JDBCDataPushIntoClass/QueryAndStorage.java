package Demo02JDBCDataPushIntoClass;

import Demo03JDBCUtils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueryAndStorage {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet resultSet = null;
        List<EmpDataBase> lists = new ArrayList<>();
        try {
            String sql = "select * from emp";
            conn = JDBCUtils.getConnection();
            stat = conn.createStatement();
            resultSet = stat.executeQuery(sql);
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");
                lists.add(new EmpDataBase(id, ename, job_id, mgr, joindate, salary, bonus, dept_id));
            }
            System.out.println(lists);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, stat, conn);
        }
    }
}
