package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        int id = 2;
        String name = "ABC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully!");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gvaiet", "root", "Bomby@17");
        
        /*PreparedStatement stmt = connection.prepareStatement("insert into demo values(" + id + ", '" + name + "')");
stmt.execute();
        */
        
        PreparedStatement stmt = connection.prepareStatement("insert into demo values(?, ?)");
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.execute();

    }
}

