package kr.ac.smu.day02;

import java.util.Scanner;
public class ScannerMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//순서에 따라 오류가 발생한다.
		//입력 버퍼를 사용하기 때문에 생긴다(모든 언어에서 발생한다).
		//입력 버퍼는 속도를 빠르게 하기 위해 사용한다.
		
		System.out.println("정수를 입력 : ");
		int num1 = sc.nextInt();
		sc.nextLine(); //버퍼를 비우는것. 엔터를 없애기 위해.
		
		System.out.println("문자를 입력: ");
		char c = sc.nextLine().charAt(0); //enter를 문자로 취급한다. buffer에 엔터만 남아있다. enter만 남아있기 때문에
		
		
		//정수 실수 입력 받는 경우에는 붙여준다. 버퍼를 깨끗하게 하기 위해.
		//int num3 = Integer.parseInt(sc.nextLine());
		
		System.out.println("정수를 입력: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num1 : " + num1 + ", ch : " + c);
		System.out.println("num2 : " + num2);
		
	}
}
