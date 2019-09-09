package io.github.meesont;

import io.github.meesont.exceptions.UserNotFoundException;
import io.github.meesont.user.User;

import java.util.Collection;

public interface UserService {

    void addUser(User user);

    Collection<User> getUsers();

    User getUser(String userId);

    void deleteUser(String userId);

    User editUser(User user) throws UserNotFoundException;

    boolean userExist(String userId);

}
