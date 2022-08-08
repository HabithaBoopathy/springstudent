package com.details.student.repository;

import com.details.student.model.Rank;
import com.details.student.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {

@Query(value="{studentId : ?0}")
Student findByStudentId(int id);

}
