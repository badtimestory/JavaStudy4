package com.iu.s5;

public class MyGod {
	
//	private MyGod myGod;		// 맴버변수 사용불가
	private static MyGod myGod;
	
	private MyGod() {}
	
	public static MyGod makeGod() {
		
		if(MyGod.myGod == null) {
			MyGod.myGod = new MyGod();
		}
		
		return MyGod.myGod;
		
	}
}
