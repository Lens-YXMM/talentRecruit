package recruit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import recruit.dao.UserDao;
import recruit.data.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private User user = new User();

    private List<User> list = new ArrayList<>();

    @Override
    public List<User> executeQueryForObject(Object[] obj, String sql) {
        try {
            list = jdbcTemplate.query(sql, obj, new RowMapper<User>() {
                @Override
                public User mapRow(ResultSet resultSet, int i) throws SQLException {
                    User user = new User();
                    user.setUiId(resultSet.getInt("UI_ID"));
                    user.setUiAccount(resultSet.getString("UI_Account"));
                    user.setUiPassword(resultSet.getString("UI_Password"));
                    user.setUiName(resultSet.getString("UI_Name"));
                    user.setUiGender(resultSet.getInt("UI_Gender"));
                    user.setUiPhoneNum(resultSet.getString("UI_PhoneNum"));
                    user.setUiMailAddr(resultSet.getString("UI_MailAddr"));
                    user.setUiCreatedTime(resultSet.getDate("UI_CreatedTime"));
                    user.setUiWeight(resultSet.getInt("UI_Weight"));
                    user.setUiIsdeleted(resultSet.getInt("UI_Isdeleted"));
                    user.setUiIsblacked(resultSet.getInt("UI_Isblacked"));
                    return user;
                }
            });
        } catch (DataAccessException e) {
            System.out.println("查询单条数据异常----");
            e.printStackTrace();
        }
        if (list.isEmpty()) {
            System.out.println("数组为空");
        }
        return list;
    }

    @Override
    public User getLoginResult(String account, String password) {
        String sql = "select * from sys_user_info where UI_Account = ? and UI_Password = ?;";
        user = executeQueryForObject(new Object[]{account, password}, sql).get(0);
        return user;
    }


}
