package com.iu.s6.student;
/*
 * 
 * extends 사용하여 StudentDTO를 상속받은 StudentDTOthird
 * @since 22.01.07
 * 
 * 
 * */

public class StudentDTOThird extends StudentDTO{
	// super()
	
	int physics;	// 3학년은 물리 추가

	@Override
	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.physics;
		System.out.println(total);
		
		return this.total;
	}
}
