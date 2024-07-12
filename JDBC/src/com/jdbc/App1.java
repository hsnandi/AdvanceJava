package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App1 {
    
    public static void main(String[] args) throws Exception {
    
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully!");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gvaiet", "root", "Bomby@17");
        
        PreparedStatement statement = con.prepareStatement("SELECT * FROM your_table_name");
        
        ResultSet result = statement.executeQuery();
        while(result.next()) {
            System.out.println("ID:" + result.getInt(1));
            System.out.println("Name:" + result.getString(2));
            System.out.println("Age:" + result.getInt(3));
        }
   
        result.close();
        statement.close();
        con.close();
    }
}
