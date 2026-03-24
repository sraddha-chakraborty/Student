package com.student.data.controller;

import com.student.data.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/rollNumber/{rollNumber}/subjectDetail")
    public Object getSubjects(@PathVariable Integer rollNumber)
    {
        return studentService.getSubjects(rollNumber) == null ? new Exception("Student not found!").getMessage() : studentService.getSubjects(rollNumber);
    }

    @GetMapping("/rollNumber/{rollNumber}/studentDetail")
    public Object getStudentDetail(@PathVariable Integer rollNumber)
    {
        return studentService.getStudentDetail(rollNumber) == null ? new Exception("Student not found!").getMessage() : studentService.getStudentDetail(rollNumber);
    }
}
