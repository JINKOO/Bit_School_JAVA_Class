package kr.ac.smu.day03.exam;

import java.util.Scanner;

/*
 * ���� 4���� �Է¹޾� ���� ū ���� ����ϴ� �ڵ� �ۼ�
 * 
 * ���� 4���� �Է� : 23 8 16 9
 * ���� ū �� :23
 */

public class ExamMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		
		System.out.println("���� 4�� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		sc.nextLine();
		
		if(num1 > num2 && num1 > num3) {
			if(num1 > num4) {
				System.out.print("���� ū�� : " + num1);
			}
			
		}else if(num2 > num1 && num2 > num3) {
			if(num2 > num4) {
				System.out.print("���� ū�� : " + num2);
			}
			
		}else if(num3 > num2 && num3 > num1) {
			if(num3 > num4) {
				System.out.print("���� ū�� : " + num3);
			}
			
		}else if(num4 > num1 && num4 > num2) {
			if(num4 > num3) {
				System.out.print("���� ū�� : " + num4);
			}
		}
	}
}


//int maxA = num > num2 ? num : num2;
//int maxB = num3 > num4 ? num3 : num4;
//int max = maxA>maxB ? maxA : maxB;
//System.out.printf("%d, %d, %d, %d �� ū��)


/*
 * int max = num;
 * if(max < num2) {
 *   max = num2;
 * }
 * 
 * if(max < num3) {
 * max = num3;
 * }
 * 
 * if(max < num4) {
 *  max = num4;
 * }
 * 
 * System.out.printf("%d %d %d %d �� ū �� : %d\n", num, num2, num3, num4, max);
 */ 

/*
 * 
 * int max = (num > num2 ? num : num2);
 * if(max < num3) {
 *   max = num3;
 *   }
 *   
 * if(max < num4) {
 *   max = num4;
 *   }
*/