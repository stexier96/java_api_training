package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class PostHandler implements HttpHandler {
    int return_code = 0;
    String body = "";
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if (exchange.getRequestMethod().equals("POST")){

        }
        else {
            return_code = 400;
            body = "Bad Request";
        }
        exchange.sendResponseHeaders(return_code, body.length());
    }
}
