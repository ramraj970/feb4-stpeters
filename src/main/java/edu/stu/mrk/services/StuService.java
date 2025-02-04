
package edu.stu.mrk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.stu.mrk.entity.Student;
import edu.stu.mrk.repo.StuDB;

@Service
public class StuService {

	@Autowired
	StuDB stuDB;

	public void saveSingleRec(Student stu) {

		stuDB.save(stu);
	}

	boolean isStudentThere(int stuNo) {
		Student oldStu = stuDB.findById(stuNo).orElse(new Student());

		if (oldStu.getStudId() == stuNo) {
			return true;
		}
		return false;

	}

	public String updateSingleRec(Student stu) {
		
	if(isStudentThere(stu.getStudId())) {
		return "succcesfully updated rec..."+stu.getName();
	} else {
			return "No rec found";

		}

	}

	public void saveAllRecs(List<Student> stuList) {
		stuDB.saveAll(stuList);
	}

	public Student getStudent(int stuNo) {
		return stuDB.findById(stuNo).orElse(new Student());
	}

	public List<Student> getAllStudents() {
		return stuDB.findAll();
	}

	public void deleteStudent(int stuNo) {

		stuDB.deleteById(stuNo);
	}

	public void deleteAllStudents() {
		stuDB.deleteAll();
	}

	public String updateAllRecs(List<Student> stuList) {

		Student rec = null;
		int count =0;
		for (int i = 0; i < stuList.size(); i++) {
			rec = stuList.get(i);
			if (rec != null) {
				if(isStudentThere(rec.getStudId()) == true) {
					stuDB.save(rec);
					count++;
				}
			}
		}// for
		return "successfully updated"
				+ " "+count+ " out of all recs---."+
		stuList.size();
	}

}
