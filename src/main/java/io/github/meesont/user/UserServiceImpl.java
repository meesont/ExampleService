package io.github.meesont.user;

import io.github.meesont.exceptions.UserNotFoundException;

import java.util.Collection;

public class UserServiceImpl implements UserService {

    @Override
    public void addUser(User user) {

    }

    @Override
    public Collection<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(String userId) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public User editUser(User user) throws UserNotFoundException {
        return null;
    }

    @Override
    public boolean userExist(String userId) {
        return false;
    }
}
