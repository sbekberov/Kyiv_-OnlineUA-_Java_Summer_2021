package sbekberov;

import java.util.ArrayList;

public class Model {
    private final ArrayList<User> users;

    public Model() {
        this.users = new ArrayList<>();
    }

    public void addUser(User p) {
        this.users.add(p);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}