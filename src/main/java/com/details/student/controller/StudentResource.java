package com.details.student.controller;

import com.details.student.model.Rank;
import com.details.student.model.Student;
import com.details.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("students")
@CrossOrigin(origins = "*")
public class StudentResource {
@Autowired
private StudentService studentService;


    @GetMapping
    public List<Student> getStudent() {
    return studentService.getStudent();
}

    @PostMapping
    public Boolean addStudent(@RequestBody Student student) {

        try {
            System.out.println("add works");
            studentService.addStudent(student);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @PutMapping
    public Boolean updateStudent(@RequestBody Student student) {
        try {
            studentService.updateStudent(student);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @DeleteMapping(value = "/{id}")
    public Boolean deleteStudent(@PathVariable("id") String id) {
        try {
            studentService.deleteStudent(id);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

}




