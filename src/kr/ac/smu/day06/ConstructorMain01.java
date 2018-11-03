package kr.ac.smu.day06;

/*
 * 
 * 생성자 특징
 * 1.클래스명과 동일
 * 2.반환값 존재 하지 않는다.
 * 3.JVM이 디폴트 생성자 자동생성.(단 class내에 생성자가 존재하지 않는 경우에만)
 * 4.오버로딩을 지원
 * 5.객체의 초기화(멤버변수 초기화)
 * 
 */

class Car {
	
	Car() {
		System.out.println("디폴트 생성자 Car() 호출...");
	}
	
	Car(String name) {
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car(String name, int price) {
		System.out.println();
	}
	
	void car() { //생성자때문에 메소드는 소문자로 시작.
		System.out.println("일반 메소드 void Car() 호출");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.car();
		
		Car c2 = new Car("그랜져");
		
	}
}
