package com.iu.s3.member;

public class MemberMain {
	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(40);
//		member.name = "iu";
//		member.mailAddres = "iu@gmail.com";
//		member.weight = 9.3;
//		member.hea = "iu";
//		member.height = "height";
		member.setAge(40000);
		System.out.println(member.getAge());
		
		member.setMailAddres("l1l1@gmail.com");
		String email = member.getMailAddres();
		System.out.println("이메일: " + email);
		
		member.setHeight(65.3);
		double height = member.getHeight();
		System.out.println("몸무게: " + height);
		
	}
}
