package edu.datagrok;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class  HttpServer {

    private final ExecutorService pool;

    private final int port;

    private boolean stopped;


    public HttpServer(int port, int poolSize) {

        this.port = port;

        this.pool = Executors.newFixedThreadPool(poolSize);

    }


    public void run() {

        try {

            ServerSocket server = new ServerSocket(port);

            while (!stopped) {

                Socket socket = server.accept();

                System.out.println("Socket accepted");

            }

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }

    public void setStopped(boolean stopped) {
        this.stopped = stopped;
    }
}