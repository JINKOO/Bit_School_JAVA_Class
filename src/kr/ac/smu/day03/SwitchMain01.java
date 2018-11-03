package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * if문은 조건문을 단 한개만 선택
 * switch문은 다중 선택 가능.(break문 없을때)
 * 대부분 switch문은 메뉴만들때 만 쓴다.
 * 
 * break문은 swtich문과 반복문에서만
 * if문에서는 break못쓴다. 단 if문이 switch나 반복문이 안에 있을때는 가능.
 * 
 */
public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1-3사이의 정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) { //default의 위치는 상관없다. case는 책갈피역할 break문없으면 {}안 다본다.
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("error");
		}
		sc.close();
	}
}
