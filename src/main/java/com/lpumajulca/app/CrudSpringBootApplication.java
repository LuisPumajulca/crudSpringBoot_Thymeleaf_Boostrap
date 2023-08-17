package com.lpumajulca.app;

import com.lpumajulca.app.entity.Student;
import com.lpumajulca.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}

	@Autowired
	private StudentRepository repository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Luis","Pumajulca","pumajulca@hotmail.com");
		repository.save(student1);

		Student student2 = new Student("Juana","Milagros","Mjuana@gmail.com");
		repository.save(student2);

		 */
	}
}
