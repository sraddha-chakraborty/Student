package com.student.data.controller;

import com.student.data.annotation.GetExecutionTime;
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
    @GetExecutionTime
    public Object getSubjects(@PathVariable Integer rollNumber) throws InterruptedException {
        Thread.sleep(5000);
        return studentService.getSubjects(rollNumber) == null ? new Exception("Student not found!").getMessage() : studentService.getSubjects(rollNumber);
    }

    @GetMapping("/rollNumber/{rollNumber}/studentDetail")
    @GetExecutionTime
    public Object getStudentDetail(@PathVariable Integer rollNumber) throws InterruptedException {
        Thread.sleep(2000);
        return studentService.getStudentDetail(rollNumber) == null ? new Exception("Student not found!").getMessage() : studentService.getStudentDetail(rollNumber);
    }
}
