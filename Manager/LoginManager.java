package Manager;
import Model.*;
import java.util.*;
public class LoginManager {
    public User Login(String username,String password,ArrayList<User> users){
for (User user:users){
    String tempUser=user.getUsername();
    String tempPass=user.getPassword();
    if(tempUser.equals(username)&& tempPass.equals(password)){
        return user;
    }
}
return null;
    }
}
