package com.iu.s6.student;
/*
 * 
 * extends 사용하여 StudentDTO를 상속받은 StudentDTOSecond
 * @since 22.01.07
 * 
 * 
 * */
public class StudentDTOSecond extends StudentDTO {
//	String name;	// 이름
//	int num;		// 번호
//	int kor;		// 국어
//	int eng;		// 영어
//	int math;		// 수학

	int history;	// 2학년은 국사 추가
	
	public int setTotal() {
		//overriding
		this.total = this.kor + this.math + this.eng + this.history;
		System.out.println(this.total);
		
		return this.total;
	}

}
