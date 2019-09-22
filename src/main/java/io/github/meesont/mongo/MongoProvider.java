package io.github.meesont.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import io.github.meesont.UserService;
import io.github.meesont.exceptions.UserNotFoundException;
import io.github.meesont.user.User;
import org.bson.Document;

import java.util.Collection;

public class MongoProvider implements UserService {

    private final Morphia morphia = new Morphia();
    private MongoCollection<Document> usersCollection;
    private Datastore datastore;

    public MongoProvider(MongoClient client, String dbName) {

        morphia.mapPackage("io.github.meesont.user");
        datastore = morphia.createDatastore(client, dbName);
        datastore.ensureIndexes();

        MongoDatabase db = client.getDatabase(dbName);
        usersCollection = db.getCollection("users");

    }


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
