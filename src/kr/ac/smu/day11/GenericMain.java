package kr.ac.smu.day11;

import java.util.Random;

//A class를 Generic방식으로 변환.

class B<T> { //무조건 Object형이 아니라 타입을 설정해준다.
	//private Object obj; //어떨때는 String형, random형... 동적으로 매번 다른 타입으로 하고 싶다.
    
	private T obj;
	
	B () {
		
	}
	
	B(T obj) {
	
		this.obj = obj;
	}
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
	
	void info() {
		System.out.println("obj : " + obj);
	}
	
}

class A {
	
	private Object obj;
	
	A() {
		
	}
	
	A(Object obj) {
		this.obj = obj;
	}
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
	
	void info() {
		System.out.println("obj : " + obj);
	}
}

public class GenericMain {

	public static void main(String[] args) {
		
	    B<String> b = new B<String>(new String("고진권")); //멤버변수를 String형으로 하고 싶다.
		b.getObj();
		
		B<Random> b2 = new B<Random>(new Random());
		b2.getObj();                               //굳이 명시적 형변환을 할 필요가 없다.
		
		b.info();
		b2.info();
		
//		Random r1 = (Random).getObj();
//		String str1 = String.getObj();
//		
		
		System.out.println("======================================");
		
		A a = new A(new String("Hello"));
		A a2 = new A(new String("random"));
		
		a.info();
		a2.info();
		
		//어떠한 객체가 들어가 있는지.. 명시적 형변환을 사용.
		A[] arr = {a, a2};
		
		Object obj = arr[0].getObj();
		System.out.println("문자열의 길이: " + ((String) obj).length());

		String str = (String)arr[0].getObj();
		System.out.println("문자열의 길이 : " + str.length());
		
		Random r = (Random)arr[1].getObj(); //컴파일 오류는 안나는데 실행하면 오류: string type을 random타입으로 당연히 못하지.
		System.out.println("추출된 정수 : " + r.nextInt(10));
		
		String str2 = (String)arr[1].getObj();
	}
}
