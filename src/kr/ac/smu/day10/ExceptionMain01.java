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
 * 설계할때 많이쓴다.
 * 메소드 내에서 예외를 직접처리 하는 것이 아니라
 * 자신을 호출한 쪽으로 예외처리를 떠넘기는 역할 하는 키워드
 * 얘는 무조건 예외처리가 필요합니다.
 * 통합적으로 예외처리하는 class를 따로 만드는 것.
 * 
 * ex)
 * abstract class AAA {
 * 
 *   void info() {
 *   }
 *   
 *   abstract void read();
 *   abstract void write();  //read와 write는 예외가 발생할 수 있을 거 같아. but설계할때는 (오버라이딩시)try catch를 쓸지 안쓸지 모른다.
 *   
 *   abstract void read() throws ArithmeticException;
 *   abstract void read() throws NullPointException; //이 코드는 반드시 예외 처리 코드가 필요하다고 명시하는것.
 *   
 *   통합적으로 처리
 *   public void print() throws Exception;
 * }
 * 
 * (사용자 정의 예외처리)
 * throw
 * 예외가 아닌데 예외라고 강제적으로 발생.
 * 사용자 정의.
 */

public class ExceptionMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("main start...");
		Random r = new Random();
		
		int num = r.nextInt(2);//0-2;
		System.out.println("추출된 정수 : " + num);
		
		System.out.println(10 / num); //JVM이 예외 처리 하지만 무조건 프로그램 종료 34줄이 실행 되지 않는다.
		
		System.out.println("main end...");
	}
}
