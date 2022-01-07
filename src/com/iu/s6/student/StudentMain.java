package com.iu.s6.student;
/*
 * 
 * Student의 DTO(Data Transfer Object) 생성
 * @since 22.01.07
 * 
 * 
 * */
public class StudentMain {

	public static void main(String[] args) {
		StudentDTOSecond sDtoSecond = new StudentDTOSecond();
		StudentDTOThird sDtoThird = new StudentDTOThird();
		
		sDtoSecond.kor = 10;
		sDtoSecond.eng = 20;
		sDtoSecond.math = 30;
		sDtoSecond.history = 40;
		sDtoSecond.setTotal();
		
		sDtoThird.kor = 40;
		sDtoThird.eng = 50;
		sDtoThird.math = 60;
		sDtoThird.physics = 70;
		sDtoThird.setTotal();
		
	}
}
