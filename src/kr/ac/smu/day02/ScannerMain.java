package kr.ac.smu.day02;

import java.util.Scanner;
//import java.util.Random;
//import java.util.LinkedList;
//import java.util.*; //같은 패키지에 있는 여러개의 클래스 쓸때 단 10개 미만일때는 각각 써준다. 

/*
 * Scanner 입력 메소드
 * 
 * 정수
 *  int 변수 입력 : sc.nextInt();
 *  long 변수 입력 : sc.nextLong();
 *  short 변수 입력 : sc.nextShort();
 *  byte 변수 입력 : sc.nextByte();
 *  
 * 실수
 *  float 변수 입력 : sc.nextFloat();
 *  double 변수 입력 : sc.nextDouble();
 *  
 * 논리값
 *  boolean입력 : sc.nextBoolean(); 단 true, false값만 입력 해야한다.
 *  
 * 문자열
 *  sc.next() : 단어 단위로만 입력(문자열 입력 종료를 공백문자로 인식)
 *  sc.nextLine() : 문장 단위로 입력(문자열 입력 종료를 enter만 인식)
 *  
 * 문자
 *  sc.nextLine().charAt(0)
 */
public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		//키보드 입력 => 참조형 자료형 필요
		//Scanner 타입의 변수를 만들어야한다.
		//Scanner는 다른 class에 있다.
		
		System.out.println("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.print("문자열을 입력 : ");
		String str1 = sc.next();
		System.out.println("str1 : " + str1);
		
		System.out.println("문자열 입력 : ");
		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);
		
		System.out.println("정수 입력 : ");
		int num1 = sc.nextInt(); //키보드로 정수 입력 nextInt()메소드 이용 //next => 뭔가를 가져오겠다. int형의 변수값을 하나 가져오겠다.
		System.out.println("num1 : " + num1);
		
		System.out.println("정수 입력: ");
		long num2 = sc.nextLong();
		System.out.println("num2 : " + num2);
		
		double num3 = sc.nextDouble();
		System.out.println("실수 입력: ");
		System.out.println("num3 : " + num3);
		
		float num4 = sc.nextFloat();
		System.out.println("num4 : " + num4);
	}
}
