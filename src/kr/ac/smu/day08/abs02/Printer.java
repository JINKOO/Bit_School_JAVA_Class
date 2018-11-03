package kr.ac.smu.day08.abs02;

public abstract class Printer {

	//sub class에 오버라이딩 강제성 부여.
	public abstract void print(); //접근제한자 -> 활용제한자
//모든 프린터는 출력하는 기능이 있다.
//	public void print() { 
//		System.out.println("print..."); //오버라이딩 되서 얘가 아무런 효과 없다.
//	}
}
