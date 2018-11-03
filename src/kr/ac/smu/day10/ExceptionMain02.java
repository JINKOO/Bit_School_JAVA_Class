package kr.ac.smu.day10;

import java.util.Random;

/*
 * 보통 예외 처리 if else 사용. but 사용자가 예측하지 못한 예외가 발생할 수 있다. 이러한 것에 유연하게 대처하고 싶다.
 * 예외 처리 (문제가 발생 햇다하더라도 그부분때문에 강제종료하는 것을 막기위해서, 다음 것들은 실행 가능하게)
 * 개발자가 코드를 잘 못 건드려서 예외
 * 문제 발생 (예외, 오류)
 * 
 * (예외 직접 처리)
 * try
 * catch //catch가 없다면 프로그램 강제 종료된다. 
 * finally /예외 상관없이 무조건 실행 되는 부분.
 * 
 * (예외 간접 처리)
 * throws
 * (사용자 정의 예외처리)
 * throw
 */

public class ExceptionMain02 {

	public static void main(String[] args) {

		System.out.println("main start...");
		Random r = new Random();

		int num = r.nextInt(2);// 0-2;
		System.out.println("추출된 정수 : " + num);
		
		try {
			System.out.println(10 / num); 
		} catch(ArithmeticException ae) { //ae는 어떠한 예외인지에 대한 정보를 저장하는 ArithmeticException타입의 변수
			//System.out.println("예외 발생!!!");
			//System.out.println(ae.getMessage());
			ae.printStackTrace();//어디 문장에서 에러가 나는지 추적. 보통 이것을 많이 쓴다.
		}
		
		System.out.println("main end...");
	}
}
