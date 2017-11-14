package com.university.dto;

public class UniversityDTO {
	private String name;
	private String phonenumber;
	private String address;
	private String major;
	private String grade;
	
	//객체를 가져오기위한 DTO생성자 설정. 하지만 삽입은 구분 해줘야하기 때문에 1번 2번 3번 생성자를 따로 구분 ! 
	public UniversityDTO(String name, String phonenumber, String major, String grade) {
		this.name=name;
		this.phonenumber=phonenumber;
		this.major=major;
		this.grade=grade;
	}
	public UniversityDTO(String name, String phonenumber, String address) {
		this.name=name;
		this.phonenumber=phonenumber;
		this.address=address;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}

