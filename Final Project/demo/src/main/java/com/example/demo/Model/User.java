package com.example.demo.Model;

public class User {
    Integer studentId;
    String studentName;
    Role role;


    public User(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public User setStudentId(Integer studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public User setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }
}
