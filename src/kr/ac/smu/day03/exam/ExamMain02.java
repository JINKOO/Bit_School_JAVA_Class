package kr.ac.smu.day03.exam;

import java.util.Random;

/*
 * ���� 3���� �Է¹޾� ū ������ ���� �� ������ ����ϴ� �ڵ�
 * 
 * ���� 3���� �Է� : 4 18 1
 * ��� 18 4 1
 */

public class ExamMain02 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//1-50������ ���� 3�� ����
		int a = r.nextInt(50) + 1;
		int b = r.nextInt(50) + 1;
		int c = r.nextInt(50) + 1;
		
		System.out.println("����� 3���� ���� : " + a + ", " + b + ", " + c);
		
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
