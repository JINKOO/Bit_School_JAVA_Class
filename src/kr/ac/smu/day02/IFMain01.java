package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * 기상한다.
 * 밥먹고 
 * 학교간다.
 * --------
 * 기상한다.
 * 학교간다.
 * 
 * 기상시간이  7시이전이라면 밥을 먹고 학교간다.
 *         7시이후라면 학교한다.
 */
public class IFMain01 {

	public static void main(String[] args) {
		
		System.out.println("기상한다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("기상 시간 입력하세요(6시45분 => 645) : ");
		
		int time = sc.nextInt();
		sc.nextLine(); //버퍼 비워준다.
		
		if(time < 700) {
			System.out.print("밥먹고, ");
		}
		System.out.println("학교간다.");
	}
}
