package recruit.service;


import recruit.data.entity.User;

public interface UserService {

    public User loginUser(String account, String password);

    public int loginUser(String account, String password, String ipAddr, String resolution, String browser);
}
