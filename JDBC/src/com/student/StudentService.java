package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudentService {

    // Method to insert a student into the database
    public String insertStudent(Student student) {
        try {
            Connection connection = getJDBCConnection();
            
            // Insert Address first
            String insertAddressQuery = "INSERT INTO address (area, landmark, city, pincode) VALUES (?, ?, ?, ?)";
            PreparedStatement addressStatement = connection.prepareStatement(insertAddressQuery, PreparedStatement.RETURN_GENERATED_KEYS);
            Address address = student.getAddress();
            addressStatement.setString(1, address.getArea());
            addressStatement.setString(2, address.getLandmark());
            addressStatement.setString(3, address.getCity());
            addressStatement.setString(4, address.getPincode());
            
            int rowsAffected = addressStatement.executeUpdate();
            int addressId = -1;
            if (rowsAffected > 0) {
                ResultSet generatedKeys = addressStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    addressId = generatedKeys.getInt(1);
                }
            }
            
            // Insert Student
            String insertStudentQuery = "INSERT INTO student (rollno, name, coursename, address_id) VALUES (?, ?, ?, ?)";
            PreparedStatement studentStatement = connection.prepareStatement(insertStudentQuery);
            studentStatement.setInt(1, student.getRollno());
            studentStatement.setString(2, student.getName());
            studentStatement.setString(3, student.getCoursename());
            if (addressId != -1) {
                studentStatement.setInt(4, addressId);
            } else {
                studentStatement.setNull(4, java.sql.Types.INTEGER);
            }
            
            rowsAffected = studentStatement.executeUpdate();
            
            connection.close();
            
            if (rowsAffected > 0) {
                return "Student inserted successfully";
            } else {
                return "Failed to insert student";
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

    // Method to delete a student from the database based on ID
    public String deleteStudent(int id) {
        // Implement delete operation
        return null;
    }

    // Method to update a student in the database based on ID
    public String updateStudent(Student student, int id) {
        // Implement update operation
        return null;
    }

    // Method to select a student from the database based on ID
    public String selectStudent(int id) {
        // Implement select operation
        return null;
    }

    // Method to select all students from the database
    public List<Student> selectAllStudents() {
        // Implement select all operation
        return null;
    }

    private Connection getJDBCConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/gvaiet", "root", "Bombay@17");
    }
}
