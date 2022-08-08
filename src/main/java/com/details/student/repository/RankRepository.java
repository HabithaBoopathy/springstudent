package com.details.student.repository;

import com.details.student.model.Rank;
import com.details.student.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RankRepository extends MongoRepository<Rank,String> {
    @Query(value="{studentRank : ?0}")
    Student findByStudentRank(int rank);
}
