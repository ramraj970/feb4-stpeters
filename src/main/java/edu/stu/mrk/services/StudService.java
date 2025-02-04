package edu.stu.mrk.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.stu.mrk.entity.Student;
import edu.stu.mrk.repo.StuDB;

@Service
public class StudService {

	public void saveAllRec(List<Student> stuList) {
		StuDB stuDB;
		
	}

	public Student getstudent(int stuNo) {
		
		StuDB.saveAll(stuNo);
		return null;
	}

	public Object getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
