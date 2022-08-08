package org.example.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import org.example.services.api.PersonReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ServiceLoader;

public class MyAPI {
    private static Logger logger = LoggerFactory.getLogger(MyAPI.class);
    private static short port = 7312;

    public static void main(String[] args) {
        var personReader = ServiceLoader.load(PersonReader.class).findFirst().get();
        var objMapper = new ObjectMapper();
        var result = objMapper.valueToTree(personReader.getAll());

        logger.info("API: found {} people.", personReader.getAll().size());

        var app = Javalin.create().start(port);
        app.get("/ping", ctx -> ctx.result("pong"));
        app.get("/persons", ctx -> ctx.json(result));

        logger.info("API's alive for real :-)))");
    }
}
