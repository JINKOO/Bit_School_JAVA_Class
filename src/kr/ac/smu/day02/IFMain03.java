package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * 기상한다.
 * 출발시간이 8시 이전이면 걸어서
 *        8시~8시15분 사이면 버스타고
 *        8시15분이후라면 택시타고
 * 학교간다.
 * 
 */

public class IFMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("집에서 출발한 시각을 입력하세요(8시라면=>8.00");
		
		double time = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("기상한다.");
//		if(time < 8.00) { //조건문 1
//			
//			System.out.println("걸어서");
//		
//		} else { //중첩된 if else문 조건문1이 거짓인것들 해석하는 것이 중요하다.
//			
//			if(time < 8.15) { //조건문1이 거짓인것들 중에 조건문 2가 참인경우.굳이 time>8.00 && time <8.15안해도 된다.
//				
//				System.out.println("버스타고");
//			
//			} else { //조건문1이 거짓인것들 중에 조건문 2도 거짓인 겨우
//		
//				System.out.println("택시타고");
//			}
//		}
		
		if(time < 8.15) {
			
			if(time < 8.00) {
				System.out.println("걸어서");
			} else { //8시와 8시15분사이
				System.out.println("버스타고");
			}
			
		} else {
			System.out.println("택시타고");
		}
		
		System.out.println("학교간다.");
	}
}
