package kr.ac.smu.day08.extend;

class A extends Object{ //이렇게 정의한 class는 public일수 없다. .java파일로 정의한것은 public가능 
	
	A() {
		super();  //Object에서는 디폴트 생성자가 생략되어있다. 
		System.out.println("A()생성자  호출");
	}
}

class B extends A {
	
	B() {
		super();  //이키워드가 생략되어있다. 써도 그만 안써도 그만.
		System.out.println("B()생성자 호출");
	}
}

class C extends B {

	C() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	C() {
//		System.out.println("C() 생성자 호출");
//	}
}

public class ExtendMain {

	public static void main(String[] args) {
		
		new B();  //object 생성자 -> A생성자 -> B생성자
	}
}
