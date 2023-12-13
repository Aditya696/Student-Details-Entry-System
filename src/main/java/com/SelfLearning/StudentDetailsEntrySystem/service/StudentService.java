package com.SelfLearning.StudentDetailsEntrySystem.service;

import com.SelfLearning.StudentDetailsEntrySystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
