package io.github.meesont.rest;

import com.google.gson.Gson;
import io.github.meesont.user.User;
import io.github.meesont.user.UserService;
import io.github.meesont.res.Response;
import io.github.meesont.res.Status;
import spark.Route;
import spark.Spark;

public class Routes {

    private static final Gson gson = new Gson();

    public static void setup(UserService service) {
        Spark.get("/users", getUsersRoute(service));
        Spark.post("/users", postUserRoute(service));
        Spark.delete("/users/:id", deleteUserRoute(service));
        Spark.get("/users/:id", getUserByIdRoute(service));
        Spark.put("/users/:id", editUserByIdRoute(service));
        Spark.options("/users/:id", checkIfUserExistsByIdRoute(service));
    }

    private static Route getUsersRoute(UserService service) {
        return (req, res) -> {
            res.type("application/json");
            return gson.toJson(new Response(Status.SUCCESS, gson.toJsonTree(service.getUsers())));
        };
    }

    private static Route postUserRoute(UserService service) {
        return (req, res) -> {
            res.type("application/json");
            User user = new Gson().fromJson(req.body(), User.class);
            service.addUser(user);
            return gson.toJson(new Response(Status.SUCCESS));
        };
    }

    private static Route deleteUserRoute(UserService service) {
        return (req, res) -> {
            res.type("application/json");
            service.deleteUser(req.params(":id"));
            return gson.toJson(new Response(Status.SUCCESS, "user deleted"));
        };
    }

    private static Route getUserByIdRoute(UserService service) {
        return (req, res) -> {
            res.type("application/json");
            return gson.toJson(new Response(Status.SUCCESS, gson.toJsonTree(service.getUser(req.params(":id")))));
        };
    }

    private static Route editUserByIdRoute(UserService service) {
        return (req, res) -> {
            res.type("application/json");
            User toEdit = gson.fromJson(req.body(), User.class);
            User editedUser = service.editUser(toEdit);

            if(editedUser != null) {
                return gson.toJson(new Response(Status.SUCCESS, gson.toJsonTree(editedUser)));
            } else {
                return gson.toJson(new Response(Status.FALIURE, gson.toJson("User not found or error in edit")));
            }
        };
    }

    private static Route checkIfUserExistsByIdRoute(UserService service) {
        return (req, res) -> {
            res.type("application/json");

            return gson.toJson(new Response(Status.SUCCESS,
                    (service.userExist(req.params(":id"))) ? "User exists" : "User does not exist"));
        };
    }


}
