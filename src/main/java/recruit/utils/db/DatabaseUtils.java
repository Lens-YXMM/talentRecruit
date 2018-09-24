package recruit.utils.db;/**
 * Created by JuN on 2018/4/28.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import recruit.data.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 数据库连接工具类
 *
 * @authorJuN
 * @create2018-04-28 19:33
 */
@Component("db")
public class DatabaseUtils {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 执行非查询的操作，包括增删改
     * @param sql sql语句
     * @return 返回数据库修改成功的数据条数
     * */
    public int executeNonQuery(String sql){
        int result = 0;
        try {
            result = jdbcTemplate.update(sql);
        } catch (DataAccessException e) {
            System.out.println("执行sql语句异常----");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 执行数据库查询操作，查询单挑数据
     * @param sql sql语句
     * @return 数据库中查询到的单条语句的E object，之后再赋值给对象
     */
    //public List<Object> executeQueryForObject(Object[] obj, String sql){
    //    List<Object> list = new ArrayList<>();
    //    try {
    //        //list = jdbcTemplate.queryForList(sql);
    //        list = jdbcTemplate.queryForList(sql,obj,Object.class);
    //    } catch (DataAccessException e) {
    //        System.out.println("查询单条数据异常----");
    //        e.printStackTrace();
    //    }
    //    return list;
    //}
    //public <T> List<T> executeQueryForObject(Object[] obj, String sql){
    //    List<T> list = new ArrayList<>();
    //    try {
    //        //list = jdbcTemplate.queryForList(sql);
    //        list = jdbcTemplate.query(sql,
    //                obj,
    //                new BeanPropertyRowMapper<T>(T.class));
    //    } catch (DataAccessException e) {
    //        System.out.println("查询单条数据异常----");
    //        e.printStackTrace();
    //    }
    //    return list;
    //}

    ///**
    // * 执行数据库查询操作，查询单条数据
    // * @param sql sql语句
    // * @return 数据库中查询到的单条语句的map，key值和数据库表字段名称相同
    // * */
    //public Map<String, Object> executeQueryForObject(String sql){
    //    Map<String, Object> map = null;
    //    List<Map<String, Object>> list = new ArrayList<>();
    //    try {
    //        list = jdbcTemplate.queryForList(sql);
    //    } catch (DataAccessException e) {
    //        System.out.println("查询单条数据异常----");
    //        e.printStackTrace();
    //    }
    //    if (list != null && list.size() > 0){
    //        map = list.get(0);
    //    }
    //    return map;
    //}

    /**
     * 执行数据库查询操作，查询多条数据
     * @param sql sql语句
     * @return 数据库中查询到的多条语句的list，key值和数据库表字段名称相同
     * */
    public List<Map<String,Object>> executeQueryForObjects(String sql){
        List<Map<String, Object>> list = null;
        try {
            list = jdbcTemplate.queryForList(sql);
        } catch (DataAccessException e) {
            System.out.println("查询多条数据异常----");
            e.printStackTrace();
        }
        return list;
    }

}
