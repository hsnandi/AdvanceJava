package com.student;

public class App {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Address address = new Address("gviet", "shelu east", "karjat", "410101");
        Student student = new Student(1, "Harish", "AIML", address);

        System.out.println(service.insertStudent(student));
    }
}

