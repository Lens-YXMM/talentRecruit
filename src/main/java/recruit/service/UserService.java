package recruit.service;


public interface UserService {

    public int loginUser(String account, String password);

    public int loginUser(String account, String password, String ipAddr, String resolution, String browser);
}
