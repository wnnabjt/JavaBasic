package Demo03JDBCSpring;

import Demo02Druid.DruidFactoryClass.JDBCUtils;
import jdk.jfr.StackTrace;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class SpringTest {

    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getConnection());
    @Test
    public void test1() {
        String sql = "update emp set salary = 10000 where id = ?";
        template.update(sql, 1001);
    }

    @Test
    public  void test2() {
        String sql = "insert into emp(id, ename) values(?, ?)";
        template.update(sql, 1, "边俊亭");
    }

    @Test
    public void test3() {
        String sql = "delete from emp where id = ?";
        template.update(sql, 1);
    }

    @Test
    public void test4() {
        String sql = "select * from emp where id = ?";
        Map<String, Object> stringObjectMap = template.queryForMap(sql, 1001);
//        System.out.println(stringObjectMap);
    }

    @Test
    public void test5() {
        String sql = "select * from emp";
        List<Map<String, Object>> maps = template.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    @Test
    public void test6() {
        String sql = "select * from emp";
        List<Emp> query = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : query) {
            System.out.println(emp);
        }
    }

    @Test
    public void test7() {
        String sql = "select count(id) from emp";
        Long aLong = template.queryForObject(sql, Long.class);
        System.out.println(aLong);
    }

}
