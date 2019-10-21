package com.springboot.studentdemo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	
	@Column(name="StudentName")
	private String studentName;
	
	@Column(name="Email")
	private String email;
	@Column(name="Mobile")
	private Integer mobile;
	@Column(name="UserName")
	private String userName;
	
	@Column(name="PassWord")
	private String passWord;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public String getUserName() {
		return userName;
	}

	
	
	
	
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", mobile="
				+ mobile + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
	
	
	
	
	
	

}
