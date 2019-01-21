package com.devcolibri.database;

import java.sql.*;

/**
 * Created by admin on 1/20/19.
 */
public class DBWoker {
    public static final String URL = "jdbc:mysql://localhost:3306/testCustomer";
    public static final String USER = "root";
    public static final String PASSWORD = "rootroot";
    private Driver driver;
    private Connection connection;

    public DBWoker() {
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e1) {
            System.out.println("Драйвер не зарегистрировался");
            return;
        }
        try {
           connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (!connection.isClosed())
                System.out.println("Соединение с бд установлено");

        }catch (SQLException e2){
            System.err.println("Соединение с бд не установлено");
        }

    }

    public Connection getConnection() {
        return connection;
    }
}

