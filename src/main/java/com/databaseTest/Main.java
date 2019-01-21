package com.databaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Calendar;

/**
 * Created by admin on 1/21/19.
 */
public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/testCustomer";
    private static final String USER = "root";
    private static final String PASSWORD = "rootroot";

    private static final String SQL = "INSERT INTO dish VALUES(?,?,?,?,?,?,?)";

    public static void main(String[] args) {
        Connection connection = null;
        Driver driver;
        PreparedStatement preparedStatement = null;
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "new title");
            preparedStatement.setString(3, "desc");
            preparedStatement.setFloat(4, 0.2f);
            preparedStatement.setBoolean(5, true);
            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setBlob(7, new FileInputStream("smile.png"));
            preparedStatement.execute();


    }catch (SQLException e) {
            System.out.println("Driver running...");
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("file not exist");
        }
        try {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            if(!connection.isClosed())
            System.out.println("Connection is accept");
        }catch (SQLException e) {
            System.out.println("Connection is not accept");
        }

    }
}
