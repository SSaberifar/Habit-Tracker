package App;

import User.User;

import java.util.ArrayList;

public class Application {

    private ArrayList<User> users = new ArrayList<User>(10);

    public void addUser(String username, String password) {
        users.add(new User(username, password));
    }

    public User[] getUserByName(String name) {
        User[] userContainer = new User[10];
        int i = 0;
        for (User user : users) {
            if (user.getUsername().equals(name)) {
                userContainer[i] = user;
            }
        }
        return userContainer;
    }

    public void removeUser(User user) {
        for (User userAlter : users) {
            if (user.getUsername().equals(userAlter.getUsername())) {
                users.remove(userAlter);
            }
        }
    }
}
