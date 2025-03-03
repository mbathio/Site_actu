package soap;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@WebService(serviceName = "UserWebService")
public class UserWebService2 {

    private List<User2> users = new ArrayList<>();

    public UserWebService2() {
        // Initialisation avec quelques utilisateurs de démonstration
        users.add(new User2("admin", "admin123", "Administrator"));
        users.add(new User2("editor", "editor123", "Editor"));
        users.add(new User2("user", "user123", "Regular User"));
    }


    @WebMethod
    public List<User2> listUsers() {
        return users;
    }


    @WebMethod
    public void addUser(@WebParam(name = "user") User2 user) {
        users.add(user);
    }

    @WebMethod
    public void deleteUser(@WebParam(name = "username") String username) {
        users.removeIf(u -> u.getUsername().equals(username));
    }

    @WebMethod
    public void updateUser(@WebParam(name = "user") User2 user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(user.getUsername())) {
                users.set(i, user);
                return;
            }
        }
    }

    @WebMethod
    public boolean authenticate(@WebParam(name = "username") String username,
                                @WebParam(name = "password") String password) {
        for (User2 user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
