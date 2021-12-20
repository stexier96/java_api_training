package fr.lernejo.navy_battle;

public class Launcher {

    public static void main(String[] args) {
        int port;
        if (args.length == 1){
            port = Integer.parseInt(args[0]);
        }
        else {
            System.out.println("No port given, dafaulting to port 8080");
            port = 8080;
        }

        Server myserver = new Server(port);
        myserver.start();

    }
}
