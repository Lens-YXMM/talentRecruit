package recruit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import recruit.dao.UserDao;
import recruit.utils.db.DatabaseUtils;

import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    DatabaseUtils db = new DatabaseUtils();

    public void setDb(DatabaseUtils db) {
        this.db = db;
    }

    @Override
    public int getLoginResult(String account, String password) {
        String sql = "select UI_Account, UI_Password from sys_user_info where UI_Account="+account+",UI_Passoword="+password+";";
        Map<String, Object> map = null;
        map = db.executeQueryForObject(sql);
        if (map==null||map.isEmpty()){
            return -1;
        }
        return 1;
    }


}
