package com.iu.s8.rpg;

public class RpgMain {

	public static void main(String[] args) {
		Knight k1 = new Knight();
		Magician m1 = new Magician();
		// Magician type은 Character type 이다
		int num = 10;
		m1.name = "간달프";
		m1.hp = 100;
		m1.mp = 50;
		
		// Matiction typed은 Character type이다.
		Character c1 = m1;
		
		System.out.println(c1.name);
		System.out.println(c1.hp);
		//System.out.println(c1.mp);
		
		m1 = (Magician)c1;
		
		System.out.println(m1.name);
		System.out.println(m1.hp);
		System.out.println(m1.mp);
		
		
	}
}
