package kr.ac.smu.day04.exam;

import java.util.Random;

/*
 * <10���� ���� ���> //1-10������ ����
 * 3 4 7 1 4 3 6 2 3
 * 
 * <¦��>
 * 4 2
 * �� ����: 
 * ���� :
 * 
 * <Ȧ��>
 * 3 7 1 3 3
 * �� ����:
 * ����:
 */
public class ExamMain02 {
	public static void main(String[] args) {

		Random r = new Random();
		
		int[] arr = new int[10];
		int count = 0;
		int sum = 0;
		
		System.out.println("���� 10�� ���");
	
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("<<¦��>>");
		for(int num : arr) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
				sum = sum + num;
				count++;
			}
		}
		
		System.out.printf("�� ���� : %d\n", count);
		System.out.printf("��   �� : %d\n", sum);
		System.out.println();
		
		count = 0;
		sum = 0;
		System.out.println("<<Ȧ��>>");
		for(int num : arr) {
			if(num % 2 != 0) {
				System.out.print(num + " ");
				sum = sum + num;
				count++;
			}
		}
		System.out.println();
		System.out.printf("�� ���� : %d\n", count);
		System.out.printf("��   �� : %d\n", sum);
	}
}
