package behavioral.chainofresponsability;

import java.util.HashMap;
import java.util.Map;

public class UserExistsMiddleware extends Middleware {
    private final Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("This email is not registered!");
            return false;
        }

        if(!server.isValidPassword(email, password)){
            System.out.println("Wrong password!");
            return false;
        }
        return true;
    }
}
//
//class Server {
//    private final Map<Integer, User> accounts = new HashMap<>();
//    private static Integer nextId = 1;
//    public void add(String email, String password) {
//        accounts.put(nextId, new User(email, password));
//        nextId++;
//    }
//
//    public boolean hasEmail(String email) {
//        return accounts.values().stream()
//                .anyMatch(u->u.email.equals(email));
//    }
//
//    public boolean isValidPassword(String email, String password) {
//        return accounts.values().stream()
//                .anyMatch(u->u.email.equals(email)
//                && u.password.equals(password));
//    }
//}
//
//class User{
//    public String email;
//    public String password;
//
//    public User(String email, String password) {
//        this.email = email;
//        this.password = password;
//    }
//}
