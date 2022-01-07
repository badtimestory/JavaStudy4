package com.iu.s7.zoo;

public abstract class Animal {
	String name;
	int age;
	
	public void eat() {
		System.out.println("찹찹ㅊ바");
	}
	
	public abstract void sleep();
}
