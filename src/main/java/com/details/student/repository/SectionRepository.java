package com.details.student.repository;

import com.details.student.model.Section;
import com.details.student.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends MongoRepository<Section,String>{
    @Query(value="{studentSection : ?0}")
    Student findByStudentSection(int section);
}
