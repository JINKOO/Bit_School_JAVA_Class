package kr.ac.smu.day06;

/*
 * 메소드 오버로딩(매개변수에 따라 동일한 기능을 하면 이름을 같게 하고 싶음) 
 *  :같은 class내에서 메소드 명은 동일하나
 *   매개변수의 개수나 자료형이 서로 다른 것. => 서로 다른 메소드로 인식한다.
 *   ex) System.out.println("hello");
 *       System.out.println();
 *       System.out.println(10);
 *       
 *   class PrintWriter {
 *      
 *      void println(String str) {}
 *      void println(int i) {}
 *      void println(char c) {}
 *      
 *   }
 */

public class Method {

	//객체 지향 프로그램에서는 메소드를 구분하는 것은 메소드명 + 매개변수로 구분한다.
	//C언어는 메소드 구문이 메소드명;
	//따라서 자바에서는 매개변수만 다르면 동명의 메소드명 가능.
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
//	int call() { //리턴 타입은 메소드 구분 짓지 못한다.
//		System.out.println("call() 메소드 호출" );
//		return 1;
//	}
	
//	void call(char c) {
//		System.out.println("call() 메소드 호출...");
//	}
	
//	void call(int i) {  //메소드 오버로딩
//		System.out.println("call(int) 메소드 호출...");
//	}
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(String str) {
		System.out.println("call(String) 메소드 호출");
	}
	void call(String str, int i) {
		System.out.println("call(String, int) 메소드 호출");
	}
}
