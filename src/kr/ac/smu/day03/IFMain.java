package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * 다중 if문 은 중첩된 if문을 대등적인 코드로 보여주기 위한 방식.
 */

public class IFMain {

	public static void main(String[] args) {
		
		System.out.println("기상한다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("출발 시간 입력: ");
		
		double time = sc.nextDouble();
		sc.nextLine();
		
		if(time < 8.00) {
			System.out.println("걸어서");
		} else if(time < 8.15) {
			System.out.println("버스타고");
		} else { /*조건식 1거짓, 조건식2도 거짓*/
			System.out.println("택시타고");
		}
		
		System.out.println("학교간다.");
		sc.close();
	}
}
