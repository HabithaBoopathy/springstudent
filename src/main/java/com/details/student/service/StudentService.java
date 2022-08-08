package com.details.student.service;

import com.details.student.model.Rank;
import com.details.student.model.Student;
import com.details.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;



    public List<Student> studentList = new CopyOnWriteArrayList<>();
    public Student addStudent(Student student){
        return studentRepository.insert(student);
    }
    public List<Student> getStudent(){return studentRepository.findAll();}
    public Student getStudent(String id){
        Optional<Student> optional =studentRepository.findById(id);
        if(optional.isPresent()){
        return optional.get();
        }else{
         return null;
        }
    }
public String deleteStudent(String id){
studentRepository.deleteById(id);
return "success";
    }
    public Student updateStudent(Student student)
    {

        return studentRepository.save(student);
    }


}
