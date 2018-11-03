package kr.ac.smu.day03.exam;

import java.util.Random;

/*
 * 정수 3개를 입력받아 큰 수에서 작은 수 순으로 출력하는 코드
 * 
 * 정수 3개를 입력 : 4 18 1
 * 출력 18 4 1
 */

public class ExamMain02 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//1-50사이의 정수 3개 추출
		int a = r.nextInt(50) + 1;
		int b = r.nextInt(50) + 1;
		int c = r.nextInt(50) + 1;
		
		System.out.println("추출된 3개의 정수 : " + a + ", " + b + ", " + c);
		
		int min,max;
		
		if(a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		if(c > max) {
			System.out.printf("%d > %d > %d\n", c, max, min);
		} else if(c > min){ //min<c<max 
			System.out.printf("%d > %d > %d\n", max, c, min);
		} else {
			System.out.printf("%d > %d > %d\n", max, min, c);
		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2, num3;
//		
//		System.out.print("num1 : ");
//		num1 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("num2 : ");
//		num2 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("num3 : ");
//		num3 = sc.nextInt();
//		sc.nextLine();
//		
//		if(num1 < num2 && num1 < num3) {
//			if(num2 < num3) {
//				System.out.println(num1 + ", " + num2 + ", " + num3);
//			} else {
//				System.out.println(num1 + ", " + num3 + ", " + num2);
//			}
//		} else if(num2 < num1 && num2 < num3) {
//			if(num1 < num3) {
//				System.out.println(num2 + ", " + num1 + ", " + num3);
//			} else {
//				System.out.println(num2 + ", " + num3 + ", " + num1);
//			}
//		} else if(num3 < num2 && num3 < num1) {
//			if(num2 < num1) {
//				System.out.println(num3 + ", " + num2 + ", " + num1);
//			}else {
//				System.out.println(num3 + ", " + num1 + ", " + num2);
//			}
//				
//		}
//			
	}
}
