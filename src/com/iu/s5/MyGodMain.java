package com.iu.s5;
/*
 * 
 * SingleTone 사용하기
 * @since 21.01.06
 * 
 * 
 * */

public class MyGodMain {
	public static void main(String[] args) {
		// SingleTone
		MyGod mg = MyGod.makeGod();
		System.out.println(mg);
		
		MyGod mg2 = MyGod.makeGod();
		System.out.println(mg2);
		
	}
}
