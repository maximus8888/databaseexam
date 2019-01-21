package com.devcolibri.database;



import java.sql.*;

/**
 * Created by admin on 1/20/19.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        DBWoker dbWoker = new DBWoker();
        Statement statement = dbWoker.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users;");

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setUserName(resultSet.getString("userName"));
            user.setPassword(resultSet.getString("password"));
            System.out.println(user);

        }
    }

//    public class Main {
//        public static final String URL = "jdbc:mysql://localhost:3306/testCustomer";
//        public static final String USER = "root";
//        public static final String PASSWORD = "rootroot";
//
//        public static void main(String[] args) throws SQLException {
//
//            Driver driver;
//            try {
//                driver = new com.mysql.cj.jdbc.Driver();
//                DriverManager.registerDriver(driver);
//            } catch (SQLException e1) {
//                System.out.println("Драйвер не зарегистрировался");
//                return;
//            }
//            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//                 Statement statement = connection.createStatement()) {
//                if (!connection.isClosed())
//                    System.out.println("Соединение с бд установлено");
//                statement.execute("INSERT INTO animal (animal_name, animall_desk) VALUES ('name', 'desc');");
//                int i = statement.executeUpdate("UPDATE animal SET animal_name = 'New name' WHERE id = 1;");
//                ResultSet set = statement.executeQuery("SELECT * FROM animal;");
//                statement.addBatch("INSERT INTO animal (animal_name, animall_desk) VALUES ('fox', 'red');");
//                statement.addBatch("INSERT INTO animal (animal_name, animall_desk) VALUES ('pig', 'blue');");
//                statement.addBatch("INSERT INTO animal (animal_name, animall_desk) VALUES ('dog', 'grey');");
//                statement.executeBatch();
//
//            } catch (SQLException e2) {
//                System.err.println("Соединение с бд не установлено");
//            }
//        }
//    }

}