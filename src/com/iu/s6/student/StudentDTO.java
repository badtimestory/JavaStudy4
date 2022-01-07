package com.iu.s6.student;
/*
 * 
 * 부모 DTO인 StudentDTO 생성
 * @since 22.01.07
 * 
 * 
 * */
public abstract class StudentDTO {
	String name;	// 이름
	int num;		// 번호
	int kor;		// 국어
	int eng;		// 영어
	int math;		// 수학
	int total;
	
	public abstract int setTotal();
}
