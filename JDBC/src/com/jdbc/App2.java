package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App2 {
	
    public static void main(String[] args) {
	
        String url = "jdbc:mysql://localhost:3306/gvaiet_db";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement statement = connection.prepareStatement("select * from demo where id=?");

            statement.setInt(1, 3);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                System.out.println("Id:" + result.getInt("id")); 
                System.out.println("Name:" + result.getString("name")); 
                System.out.println("Age:" + result.getInt("age"));
            }

            connection.close(); 

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
