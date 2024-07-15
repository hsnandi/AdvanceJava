package com.Hibernate.com.Hibernate;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "subject_name", nullable = false, length = 100)
    private String subjectName;

    @ManyToOne
    private Student student;

    // Required no-argument constructor
    public Subject() {
    }

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    // Getters and setters

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
