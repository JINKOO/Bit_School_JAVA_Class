package kr.ac.smu.day09;

public class Parent {

	private String name = "부모";
	
	
	static Parent getInstance() { //Parent형. 객체하나 생성.
		
		return new Child01();  //메인 함수 말고 여기만 바꾸면 된다. 리턴 타입을 묵시적 형변환
	}
	
	
	public void info() {
		System.out.println("name : " + name);
	}
}
