package jjp;

import java.sql.Timestamp;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class check {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sakila";
    private static final String USER = "root";
    private static final String PASSWORD = "aziz0909";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Successfully connected to MySQL!");

            statement = connection.createStatement();

            // Step 4: Execute SQL SELECT query
            String sql = "SELECT * FROM actor;";
            ResultSet resultSet = statement.executeQuery(sql);
            
           

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("actor_id");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                Timestamp last_update = resultSet.getTimestamp("last_update");

                System.out.println("ID: " + id + ", First Name: " + first_name +
                        ", Last Name: " + last_name + ", Last Update: " + last_update);
            }
            resultSet.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close connection
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}