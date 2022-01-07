package com.iu.s3.member;
/*
 * 접근지정자를 활용한 getter, setter
 * 이름
 * 이메일주소
 * 몸무게
 * 키
 * 나이
 * @since 22.01.06
 * 
 * 
 * */


public class Member {

	private String name;		// 이름
	private String mailAddres;	// 이메일
	private double weight;		// 몸무게
	private double height;		// 키
	private int age;			// 나이
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailAddres() {
		return mailAddres;
	}
	public void setMailAddres(String mailAddres) {
		this.mailAddres = mailAddres;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// setter, getter
	// set변수명, get변수명
	

}
