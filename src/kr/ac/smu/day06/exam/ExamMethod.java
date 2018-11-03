package kr.ac.smu.day06.exam;

import java.util.Random;
import java.util.Scanner;

public class ExamMethod {

	/**
	 * ȣ���� �޼ҵ尡 ����2���� �Ѱ��ָ� 2���� ������ ���ؼ� ȣ���ڸ޼ҵ忡 ��� ��ȯ
	 * 
	 * @param num1
	 * @param num2
	 * @return �� ��
	 */

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * Ű����� �ϳ��� ������ �Է� �ް�, �� ������ ȣ���� �޼ҵ�� ��ȯ
	 */
	public int getInt() {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}

	/**
	 * ȣ���ڰ� �Ѱ��� �� ���� ������ ������ ��ȯ�ϴ� ���.
	 * 
	 * @param num1
	 * @param num2
	 * @return �� ��
	 */

	public int getSum(int num1, int num2) {

		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public void displayTotalSum(int num1, int num2, int total) {

		System.out.printf("%d ~ %d���� �� �� : %d", num1, num2, total);
	}

	/**
	 * 1~100������ ������ 10�� �����Ͽ� ��ȯ
	 * 
	 * @return
	 */
	public int[] getNums() {

//		Random r = new Random();
//		int[] arr = new int[10];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(100) + 1;
//		}
//		int[] arr = this.getNums(10);//this: �ڱ� ���� ����(�̹� ������ ��ü�� ȣ���Ҷ�) ������ �ڽ��� class�� �ִ� �޼ҵ� ȣ���Ҷ��� this����.
		int[] arr = this.getNums(10, 100);
		return arr;
	}
	
	public int[] getNums(int size) {
		
//		Random r = new Random();
//		int[] arr = new int[size];
//		
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] = r.nextInt(100) + 1;
//		}
		
		int[] arr = getNums(size, 100);
		return arr;
	}
	
	/**
	 * 1~max������ ������ size�� �����Ͽ� ��ȯ
	 * @param size
	 *  ������ ���� ����
	 * @param max
	 *  ������ ���� ����
	 * @return
	 *  ����� ���� �迭
	 */
	
	public int[] getNums(int size, int max) {
		
		Random r = new Random();
		int arr[] = new int[size];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(max) + 1;
		}
		
		return arr;
	}
	
	public void displayArr(int[] arr) {
		System.out.println("<<�� " + arr.length + "���� ���� ���>>");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
