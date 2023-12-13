package com.SelfLearning.StudentDetailsEntrySystem.repository;

import com.SelfLearning.StudentDetailsEntrySystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
