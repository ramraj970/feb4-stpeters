package edu.stu.mrk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.stu.mrk.entity.Student;
import edu.stu.mrk.services.StudService;

@RestController
public class StuController {
	@Autowired
	 StudService StudSer;

	
	@PostMapping("/stu/add/user/all")
	public  String addAllStuRec(@RequestBody List<Student> stuList) {
		
		StudSer.saveAllRec(stuList);
		
		return"successfully added new students";
		
		
	}
	@GetMapping("/stu/add/user/one")
	public Student getOneStuRec(@RequestParam int stuNo) {
		return StudSer.getstudent(stuNo);
		
	}
	

}
