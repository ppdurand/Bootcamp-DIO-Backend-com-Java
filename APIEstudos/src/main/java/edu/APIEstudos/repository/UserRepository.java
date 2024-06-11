package edu.APIEstudos.repository;

import edu.APIEstudos.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();
    private int nextId = 1;

    public void add(User user) {
        user.setId(nextId++);
        users.add(user);
    }

    public Optional<User> getById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst();
    }

    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    public boolean update(int id, User updatedUser) {
        Optional<User> userOpt = getById(id);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            user.setLogin(updatedUser.getLogin());
            user.setPassword(updatedUser.getPassword());
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        return users.removeIf(user -> user.getId() == id);
    }
}
