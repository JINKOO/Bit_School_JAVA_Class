package kr.ac.smu.day10;

import java.util.Random;

/*
 * 117.16.40.180
 * final 키워드 
 * 1. 멤버 변수 : 상수(수정 금지)
 * 2. 메소드    : 오버라이딩 금지
 * 3. 클래스    : 상속 금지.
 */

/*final*/ class Super {

	private /*final*/ int max = 100;
	
	public Super() {
		max = 50;
	}
	
	public /*final*/ void info() {
		System.out.println("Super class에서 정의한 info()메소드...");
	}
}

class Sub extends Super {
	
	@Override
	public void info() {
		System.out.println("Sub class에서 재정의한 info()메소드...");
	}
}

class MyRandom extends Random {  //기존에 있는 API를 상속받아 임의의 메소드를 오버라이드 하여 가공하고자 할때 이렇게 할 수 있다.

	@Override
	public int nextInt(int bound) { //nextInt는 random클래스의 메소드. 
		// TODO Auto-generated method stub
		return super.nextInt(bound) + 1;
	}
}

//class MyString extends String {  //String class는 final이어서 내 마음대로 재정의 할 수 없다.
//	
//}

public class FinalMain {

	public static void main(String[] args) {
		
		//1~100난수 추출
//		Random r = new Random();
//		
//		int random = r.nextInt(100) + 1;
//		//random 은 보통 0부터. +1을 붙이기 싫다.
//		System.out.println("추출된 정수 : " + random);
		
		
		//원래 있는 class를 가공해서 만든다.
		MyRandom r = new MyRandom();
		int random = r.nextInt(100); //1~100
		System.out.println("추출된 정수 : " + random);
		
	}
}
