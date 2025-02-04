package edu.stu.mrk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.stu.mrk.entity.Student;

public interface StuDB extends JpaRepository<Student, Integer> {

	static void saveAll(int stuNo) {
	StuDB studb;
		
	}

}
