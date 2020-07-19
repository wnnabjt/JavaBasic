package Demo01JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

public class Demo03Delete {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "delete from account where id = 1";
            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "wnnnggabjt123@");
            stat = conn.createStatement();
            int count = stat.executeUpdate(sql);
            if(count > 0) {
                System.out.println(count);
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if(stat != null) {
                try {
                    stat.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

}
