package io.github.meesont;

import io.github.meesont.rest.Routes;
import io.github.meesont.user.UserService;
import io.github.meesont.user.UserServiceImpl;

public class Main {

    public static void main(String[] args) {

        final UserService userService = new UserServiceImpl();
        Routes.setup(userService);
    }

}
