package recruit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import recruit.dao.UserDao;
import recruit.dao.impl.UserDaoImpl;
import recruit.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int loginUser(String account, String password) {

        return userDao.getLoginResult(account,password);
    }

    @Override
    public int loginUser(String account, String password, String ipAddr, String resolution, String browser){
        int result = 0;
        return result;
    }
}
