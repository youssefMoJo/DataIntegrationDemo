package main.java;

import main.java.config.DatabaseConnection;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(DatabaseConnection.getConnection());
    }
}
