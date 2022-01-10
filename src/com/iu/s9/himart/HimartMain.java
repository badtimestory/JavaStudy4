package com.iu.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		// Tv, Computer, Phone 정보 입력
		Tv tv = new Tv();
		Computer com = new Computer();
		Phone phone = new Phone(); 
		
		tv.brand = "4K UHD QLED TV";
		tv.company = "삼성";
		tv.point = 50_000;
		tv.price = 1_700_000;
		tv.size = 55;
		
		com.brand = "Legion 5 Pro";
		com.company = "Lenovo";
		com.cpu = "AMD Ryzen 5 5600H";
		com.price = 1_368_840;
		com.point = 30_000;
		
		phone.brand = "Iphone pro 13";
		phone.company = "Apple";
		phone.pixel = 460;
		phone.price = 1_282_500;
		phone.point = 25_000;
		
		Client iu = new Client();
		iu.money = 10_000_000;
		iu.point = 0;
		iu.buy(com);
	}
}
