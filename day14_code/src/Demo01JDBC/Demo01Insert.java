package Demo01JDBC;

/*
    1. 导入驱动jar包 mysql-connector-java-5.1.37-bin.jar
        1.复制mysql-connector-java-5.1.37-bin.jar到项目的libs目录下
        2.右键-->Add As Library
    2. 注册驱动
    3. 获取数据库连接对象 Connection
    4. 定义sql
    5. 获取执行sql语句的对象 Statement
    6. 执行sql，接受返回结果
    7. 处理结果
    8. 释放资源
 */

import java.sql.*;

public class Demo01Insert {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from account";
            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "wnnnggabjt123@");
            stat = conn.createStatement();
            resultSet = stat.executeQuery(sql);
            while(resultSet.next()) { // 判断当前行是否有数据
                int id = resultSet.getInt("id");
                int balance = resultSet.getInt("balance");
                String name = resultSet.getString("name");

                System.out.println(id + "----" + balance + "----" + name);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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

            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

}
