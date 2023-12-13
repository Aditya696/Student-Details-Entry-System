package com.SelfLearning.StudentDetailsEntrySystem;

import com.SelfLearning.StudentDetailsEntrySystem.entity.Student;
import com.SelfLearning.StudentDetailsEntrySystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDetailsEntrySystemApplication implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsEntrySystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student rdj=new Student("Robert","Downey Junior","RDJ@gmail.com");
//		studentRepository.save(rdj);
//		Student murphy=new Student("Cillian","Murphy","Murphy@gmail.com");
//		studentRepository.save(murphy);
//		Student jd =new Student("Johnny","Depp","JD@gmail.com");
//		studentRepository.save(jd);
	}
}
