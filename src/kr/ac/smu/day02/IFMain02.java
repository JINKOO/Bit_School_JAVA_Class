package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * 기상한다.
 * 집에서 출발한 시간이 8시 이전이면 => 걸어서
 *               8시 이후하면 => 버스타고
 * 학교간다.
 */

public class IFMain02 {

	public static void main(String[] args) {
		
		System.out.println("기상한다.");
		System.out.println("집에서 출발한 시각을 입력하세요(7시 50분이라면 7.50): ");
		
		Scanner sc = new Scanner(System.in);
		
		double time = sc.nextDouble();
		sc.nextLine();
		
		if(time < 8.00) {
			
			System.out.println("걸어서");
		}
		
		else{ //자바에서 else는 이렇게 쓴다.
			
			System.out.println("버스타고");
		}
		
		//if와 else 사이에는 다른 코드 들어오면 안된다.
		System.out.println("학교간다.");
	}
}
