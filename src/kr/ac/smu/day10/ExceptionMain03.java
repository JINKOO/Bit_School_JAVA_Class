package kr.ac.smu.day10;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("main start...");

		for (int i = -2; i < 4; i++) {
			try {
				System.out.println(1 / i);
			} catch (ArithmeticException ae) {
				//ae.printStackTrace();
				System.out.println("예외발생!!!");
				break;
			}finally { //break문으로 빠져나가는 것이 아니라 finally수행 후 break문 수행. finally는 무조건 수행된다. 메소드(return) 호출or 반복문(break) 쓸때 finally.자주 쓴다.
				System.out.println("반복문 수행중");
			}
		}
		System.out.println("main end...");
	}
}
