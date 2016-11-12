package Project2;

import java.util.ArrayList;

/**
 * The central server
 * @author Jacob Zelasko, Wesley Krug
 */
public class CentralServer {
    ArrayList<User> users;
    ArrayList<String> files;
    public CentralServer(){
        users = new ArrayList<User>();
        files = new ArrayList<String>();
    }
    public void storeUserInfo(String username, String hostname, String connectionSpeed){
        User user = new User(username, hostname, connectionSpeed);
        users.add(user);
    }
}
