package kr.ac.smu.day09;

public class Child01 extends Parent {

	String name = "자식";
	int age = 15;
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	@Override
	public void info() {
		System.out.println("첫번째 자식에서 오버라이딩 된 메소드 info()...");
	}
}
