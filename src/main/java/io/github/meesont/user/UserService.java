package io.github.meesont.user;

import io.github.meesont.exceptions.UserNotFoundException;

import java.util.Collection;

public interface UserService {

    void addUser(User user);

    Collection<User> getUsers();

    User getUser(String userId);

    void deleteUser(String userId);

    User editUser(User user) throws UserNotFoundException;

    boolean userExist(String userId);

}
