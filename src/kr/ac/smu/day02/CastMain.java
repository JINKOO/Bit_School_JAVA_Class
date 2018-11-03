package kr.ac.smu.day02;

/*
 *  byte < short, char < int < long < float < double
 *  
 *  형변환(기본 자료형 에서만) 참조 자료형은 기준이 다르다.
 *  연산자를 기준으로 좌우의 데이터형이 다른 경우 발생.
 *  3 + 12.34 => + 기준으로 좌 우 데이터 형이 다르다.
 *  
 *  형변환 종류
 *  -묵시적 형변환
 *   자료형의 크기가 작은 변수값을 크기가 큰 자료형으로 대입되는 경우 발생.
 *  -명시적(강제적) 형변환
 *   자료형의 크기가 큰 자료형 변수가 작은 크기의 자료형에 대입되는 경우 발생.
 *   
 */

public class CastMain {

	public static void main(String[] args) {
		
		double d = 12.34; //double형이다.
		d = /*(double)*/12; 
		//묵시적 형변환 (double) 키워드 생략 가능.
		//double형 변수에 int값 대입 => 형변환 발생. int가 double로 변환.
		
		d = /*(double)*/12 + 34.5;
		//묵시적 형변환
		//int + double //형변환 발생. +를 기준으로 좌우가 데이터형이 다르다.
		
		int num = 12;
		num = (int)12.34; 
		//강제적(명시적) 형변환 키워드 생략 불가능.
		//=을 기준으로 좌우가 다르다. int형에 double을 대입하려한다. // 형변환 발생
		//예) 평균 구할 때.
		
		int a = 12, b = 5;
		double avg1 = ((double)a+b)/2;  //평균은 대부분 double로 쓴다.
		double avg2 = (double)(a + b) / 2; 
		double avg3 = (a + b) / 2.; //(int + int) / double
		//(int + int) / int => int가 나온다.
		
		System.out.println(a + ", " + b + " 평균 : " + avg1);
		System.out.println(a + ", " + b + " 평균 : " + avg2);
		System.out.println(a + ", " + b + " 평균 : " + avg3);
		
	}
}
