package com.example.student.controller;

import com.example.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private static final List<Student> STUDENTS = List.of(
            new Student(101, "Dheeraj"),
            new Student(102, "Rahul"),
            new Student(103, "Priya"),
            new Student(104, "Sneha")
    );

    @GetMapping("/students")
    public List<Student> getStudents() {
        return STUDENTS;
    }
}
