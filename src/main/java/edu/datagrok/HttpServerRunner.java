package edu.datagrok;

public class HttpServerRunner {
    public static void main(String[] args) {
        HttpServer httpServer = new HttpServer(8088, 10);
        httpServer.run();
    }
}
