package com.example.demo.Controller;

import com.example.demo.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private static final List<User> USERS = Arrays.asList(
            new User(0,"Dries"),
            new User(1,"Juliette"),
            new User(2, "Dumbledore")
    );

    @GetMapping(path = "/{studentId}")
    public User getStudent(@PathVariable("studentId") Integer studentId){
        return USERS.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("Student " + studentId + " does not exist."));
    }

}
