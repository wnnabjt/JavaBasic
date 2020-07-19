package Demo01DataSource;

/*
    1. 导入jar包 (两个) c3p0-0.9.5.2.jar mchange-commons-java-0.2.12.jar ，
        * 不要忘记导入数据库驱动jar包
    2. 定义配置文件：
        * 名称： c3p0.properties 或者 c3p0-config.xml
        * 路径：直接将文件放在src目录下即可。

    3. 创建核心对象 数据库连接池对象 ComboPooledDataSource
    4. 获取连接： getConnection
 */

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo01CreateDateSource {

    public static void main(String[] args) throws SQLException {
//        DataSource ds = new ComboPooledDataSource();
//        for(int i = 1; i < 13; i ++) {
//            Connection conn = ds.getConnection();
//            System.out.println(i + ":" + conn);
//            if(i == 5 || i == 10) {
//                conn.close();
//            }
//        }

        DataSource ds = new ComboPooledDataSource("otherc3p0");
        for(int i = 1; i < 9; i ++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":" + conn);
        }
    }

}
