package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class Server {

    private final int port;

    public Server(int port){
        this.port = port;
    }

    public void start() {
        try {
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(port), 0);
            httpServer.setExecutor(Executors.newFixedThreadPool(1));
            httpServer.start();
            System.out.println("server starting on port " + port);
            httpServer.createContext("/ping", new CallHandler());
            httpServer.createContext("/api/game/start", new PostHandler());
        } catch (IOException e) {
            System.out.println("Echec de création du serveur HTTP: " + e);
        }
    }
}
