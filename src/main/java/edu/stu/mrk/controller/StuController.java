package edu.stu.mrk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.stu.mrk.entity.Student;
import edu.stu.mrk.services.StuService;


@RestController
public class StuController {

	@Autowired
	StuService stuSer;

	@PostMapping("/stu/add/user/one")
	public String addSingleStuRec(@RequestBody Student stu) {
		stuSer.saveSingleRec(stu);
		return "successfully added new Student " + stu.getName() + " rec";
	}

	@PutMapping("/stu/update/user/one")
	public String updateSingleStuRec(@RequestBody Student stu) {
		return stuSer.updateSingleRec(stu);
	}
	@PostMapping("/stu/add/user/all")
	public String addAllStuRec(@RequestBody List<Student> stuList) {
		stuSer.saveAllRecs(stuList);
		return "successfully added all Students ";
	}
	
	
	@PutMapping("/stu/update/user/all")
	public String updateAllStuRec(@RequestBody List<Student> stuList) {
		return stuSer.updateAllRecs(stuList);
	}
	
	
	@GetMapping("/stu/get/user/one")
	public Student getOneStuRec(@RequestParam int  stuNo) {
		return stuSer.getStudent(stuNo);
	}
	@GetMapping("/stu/get/user/all")
	public List<Student> getAllStuRecs() {
		return stuSer.getAllStudents();
	}
	@DeleteMapping("/stu/del/user/one")
	public String deleteOneStuRec(@RequestParam int  stuNo) {
		stuSer.deleteStudent(stuNo);
		return "successfully got deleted student--->"+stuNo;
	}
	@DeleteMapping("/stu/del/user/all")
	public String deleteAllStuRec() {
		stuSer.deleteAllStudents();
		return "successfully got deleted all students--->";
	}

	

}