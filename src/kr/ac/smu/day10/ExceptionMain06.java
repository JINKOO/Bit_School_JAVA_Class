package kr.ac.smu.day10;

import java.io.FileReader;

abstract class Parent {
	
	abstract void print();
	abstract void read() throws Exception;  //설계할때 Exception 걸어준다.
}

class Child extends Parent {

	@Override
	void print() {
		// TODO Auto-generated method stub
	}

	@Override
	void read() throws Exception {  //read()를 호출한 애에서 예외처리.
		// TODO Auto-generated method stub
	}
}

public class ExceptionMain06 {

	static void a() {
		System.out.println("a() 메소드 호출...");

		try {
			FileReader fr = new FileReader("a.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// static void b() throws NullPointerException, ArithmeticException {
	static void b() throws Exception {
		System.out.println("b() 메소드 호출...");

		// 나를 호출한 놈에게 예외처리 떠넘김
		String str = null;
		System.out.println("문자열의 길이 : " + str.length());

		System.out.println(10 / 0);

		System.out.println("!!!"); // 에외 발생 순간 떠넘기기때문에 실행안됨.

	}

	public static void main(String[] args) { //main메소드에서는 직접처리 한다.

		System.out.println("main start...");

		a();
		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerException 예외 처리");
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticExeption 예외 처리");
//		}

		System.out.println("main end...");
	}
}
