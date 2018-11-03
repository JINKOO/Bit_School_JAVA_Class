package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * 
 * 1.초기화
 * while(2.종료조건) {
 *    3.실행문장
 *    4.증가/감소
 *}
 *5.문장
 *
 *1. 초기화;
 * do{
 *    3.실행문장;
 *    4.증가감소
 * }while(2.종료조건);   1->3->4 ->2 2가 참이면 3번 수행.
 * 5.문장
 * 
 */

public class WhileMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("1.로그인  2.회원가입  3.종료");

		do {
			System.out.println("메뉴를 입력하세요: ");
			num = sc.nextInt();
			sc.nextLine();

			switch (num) {

			case 1:
				System.out.println("아디디: ");
				System.out.println("비밀 번호: ");
				break;
			case 2:
				System.out.println("생성할 아이디 입력: ");
				System.out.println("생성할 비밀번호 입력: ");
				break;
			case 3:
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0);
				break;
			default:
				System.out.println("메뉴 번호 다시 입력하세요");
			}

		} while (num != 0);

		System.out.println("다른 페이지로 넘어가시겠습니까?");
	}
}
