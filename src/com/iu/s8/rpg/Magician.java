package com.iu.s8.rpg;

public class Magician extends Character implements Act{
	
	int mp;
	
	public void spell() {
		System.out.println("마법 공격");
	}

	@Override
	public void attack() {
		this.spell();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}
