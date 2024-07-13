package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {
    private int rollno;
    private String name;
    private String coursename;
    private Address address;

    public Student(int rollno, String name, String coursename, Address address) {
        this.rollno = rollno;
        this.name = name;
        this.coursename = coursename;
        this.address = address;
    }

    // Getters and Setters
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Update method
    public void updateStudent(int rollno, String name, String coursename, Address address) {
        this.rollno = rollno;
        this.name = name;
        this.coursename = coursename;
        this.address = address;
    }

    // Delete method
    public void deleteStudent(int id) {
        String deleteQuery = "DELETE FROM students WHERE id = ?";
        
        try (Connection connection = getJDBCConnection();
             PreparedStatement statement = connection.prepareStatement(deleteQuery)) {
            
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            
            if (rowsDeleted > 0) {
                System.out.println("Student with ID " + id + " has been deleted successfully.");
            } else {
                System.out.println("No student found with ID " + id + ". Nothing deleted.");
            }
            
        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }

    // Override toString() for meaningful representation
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", coursename=" + coursename + ", address=" + address + "]";
    }

    // Method to get JDBC connection (assuming this is a method elsewhere in your application)
    private Connection getJDBCConnection() throws SQLException {
        // Implement your JDBC connection logic here
        // Example:
        // return DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "username", "password");
        throw new SQLException("Not implemented");
    }
}
