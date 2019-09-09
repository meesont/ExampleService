package io.github.meesont;

import com.mongodb.MongoClient;
import io.github.meesont.mongo.MongoProvider;
import io.github.meesont.rest.Routes;

public class Main {

    private MongoProvider service;

    public Main() {
        MongoClient mongoClient = new MongoClient();
        this.service = new MongoProvider(mongoClient, "users");
        Routes.setup(service);
    }

    public static void main(String[] args) {
        new Main();
    }

}
