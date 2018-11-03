package kr.ac.smu.day03;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좋아하는 계절 입력: ");
		String season = sc.next();
		
		switch(season) {
		case "봄":
			System.out.println(season);
			break;
		case "여름":
			System.out.println(season);
			break;
		case "가을":
			System.out.println(season);
			break;
		case "겨울":
			System.out.println(season);
			break;
		default:
			System.out.println("다시 입력");
		}
	}
}
