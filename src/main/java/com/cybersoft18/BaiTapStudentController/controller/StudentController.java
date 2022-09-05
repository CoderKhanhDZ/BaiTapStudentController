package com.cybersoft18.BaiTapStudentController.controller;

import com.cybersoft18.BaiTapStudentController.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    List<Student> students = new ArrayList<>();

    @GetMapping("/add-student-request-param")
    public ResponseEntity<List<Student>> addStudentRequestParam(@RequestParam("name") String name, @RequestParam("age") int age) {

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        students.add(student);

        return ResponseEntity.status(HttpStatus.OK).body(students);
    }

    @GetMapping("/add-student-path-variable/{name}/{age}")
    public ResponseEntity<List<Student>> addStudentPathVariable(@PathVariable("name") String name, @PathVariable("age") int age) {

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        students.add(student);

        return  ResponseEntity.status(HttpStatus.OK).body(students);
    }

    @GetMapping("/add-student-request-body")
    public ResponseEntity<List<Student>> addStudentRequestBody(@RequestBody Student student) {
        students.add(student);
        return ResponseEntity.status(HttpStatus.OK).body(students);
    }

    @GetMapping("/views")
    public ResponseEntity<List<Student>> viewStudents() {
        return ResponseEntity.status(HttpStatus.OK).body(students);
    }

}
