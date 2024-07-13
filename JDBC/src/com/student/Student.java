package com.student;

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

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", coursename=" + coursename + ", address=" + address + "]";
    }
}
