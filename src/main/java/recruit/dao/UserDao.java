package recruit.dao;

import recruit.data.entity.User;

public interface UserDao {
    public int getLoginResult(String account, String password);

    //public int hasAccount();
    //
    ///**
    // * 根据主键查询
    // * @return
    // */
    //public User selectByPrimaryKey();
    //
    ///**
    // * 根据主键更新
    // * @return 状态码：1，成功；-1，失败；
    // */
    //public int updateByPrimaryKey();
}