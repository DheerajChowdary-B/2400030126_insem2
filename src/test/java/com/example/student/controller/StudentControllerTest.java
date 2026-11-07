package com.example.student.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void returnsStudentRecords() throws Exception {
        mockMvc.perform(get("/students"))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        [
                          {"studentId":101,"studentName":"Dheeraj"},
                          {"studentId":102,"studentName":"Rahul"},
                          {"studentId":103,"studentName":"Priya"},
                          {"studentId":104,"studentName":"Sneha"}
                        ]
                        """));
    }

    @Test
    void returnsNotFoundForUnknownEndpoint() throws Exception {
        mockMvc.perform(get("/unknown"))
                .andExpect(status().isNotFound());
    }
}
