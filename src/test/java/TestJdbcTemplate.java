/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.study.springcore.case04.jdbc.Emp;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author User
 */
public class TestJdbcTemplate {

    ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc.xml");
    JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);

    @Test
    public void test() {
        //jdbcTemplate.update("insert into emp values(null,'lili',23,'男')");
        // String sql = "insert into emp values(null,?,?,?)";
        //jdbcTemplate.update(sql, "lisa", 24, "女");
        String eids = "3,4,5";
        String sql = "delete from emp where eid in(" + eids + ")";
        jdbcTemplate.update(sql);
        String moau = "a";
        String sqls = "select from emp where ename like concat('%',?,'%')";
    }

    @Test
    public void testBatchUpdate() {
        //jdbcTemplate.update("insert into emp values(null,'lili',23,'男')");
        String sql = "insert into emp values(null,?,?,?)";
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"a1", 1, "男"});
        list.add(new Object[]{"a2", 2, "男"});
        list.add(new Object[]{"a3", 3, "男"});
        jdbcTemplate.batchUpdate(sql, list);
    }

    @Test
    public void testQueryForObject() {
        //String sql = "select eid,ename,age,sex from emp where eid = ?";
        //RowMapper<Emp> rowMapper = new BeanPropertyRowMapper<>(Emp.class);
        //Emp emp = jdbcTemplate.queryForObject(sql, new Object[]{7}, rowMapper);
        //System.out.println(emp);
        String sql = "select count(*) from emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

    @Test
    public void testQuery() {
        String sql = "select eid,ename,age,sex from emp";
        RowMapper<Emp> rowMapper = new BeanPropertyRowMapper<>(Emp.class);
        List<Emp> list = jdbcTemplate.query(sql, rowMapper);
        list.forEach(System.out::println);
    }
}
