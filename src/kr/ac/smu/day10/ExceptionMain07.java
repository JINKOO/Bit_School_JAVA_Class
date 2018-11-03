package kr.ac.smu.day10;

import java.util.Random;

/*
 * 
 * throw
 * 사용자 정의 예외처리 
 * 나만의 예외처리 class를 만들 수 있다.
 * 단, Exception class를 상속 받아야한다.
 * 
 */

public class ExceptionMain07 {

	public static void main(String[] args) {

		Random r = new Random();

		try {
			int random = r.nextInt(10);
			// 5이상의 정수면 예외 발생. JVM은 5이상이면 예외가 아니다. but 사용자가 정의하고 싶음 => 강제적으로 예외를 발생시킨다.
			System.out.println("추출된 정수 : " + random);
			if (random >= 5) {
				//throw new Exception();
				throw new Exception("5이상의 정수입니다."); //정확히 무슨 예외인지 모른다. => 사용자가 정의한 예외처리 class를 만들 수 있다. Exception class를 상속.
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
