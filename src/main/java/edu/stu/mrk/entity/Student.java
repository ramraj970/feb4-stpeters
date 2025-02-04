package edu.stu.mrk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	
	@Id
	int studId;
	String name;
	String course;
	String college;
	String mobile;
	public Student() {
	
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	

}
