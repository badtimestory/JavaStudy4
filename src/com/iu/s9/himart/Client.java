package com.iu.s9.himart;

public class Client {
	int money;	// 돈
	int point;	// 포인트
	
	public void buy(Product p) {
		this.money = this.money - money;
		this.point = this.point + point;
		System.out.println("남은 금액: " + this.money);
		System.out.println("현재 포인트: " + this.point);
	}
}
