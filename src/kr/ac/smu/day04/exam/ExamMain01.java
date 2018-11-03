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

public class ExamMain01 {

	public static void main(String[] args) {

		Random r = new Random();

		int[] arr = new int[10];

		System.out.println("<���� �߻�>");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			System.out.printf(arr[i] + " ");

		}
		System.out.println();

		// �� for���ȿ��� ¦������ Ȧ������ �Ǵ��ϴ� if�� ���� �ᱹ ��� ���� �� �ٳ���.
		// ¦�� ���� Ȧ�� ���� �ؾ���. for�� 2��
		/*
		 * System.out.print("¦���� ���: "); 
		 * for(int num : arr) { 
		 *   if(num %2 == 0)
		 *      System.out.print(num + " "); 
		 * } 
		 * System.out.println();
		 * 
		 * System.out.print("Ȧ���� ��� : "); 
		 * for(int i = 0; i<arr.length; i++) { 
		 *    if(arr[i] % 2 !=0) { 
		 *       System.out.print(arr[i] + " "); 
		 *       } 
		 * }
		 */

		int[] sum = new int[2];
		String[] title = {"¦��", "Ȧ��"};
		for(int mod = 0; mod < 2; mod++){
			System.out.println("<<" + title[mod] +  ">>");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == mod) {
					System.out.print(arr[i] + " ");
					sum[mod] = sum[mod] + arr[i];
				}
			}
			System.out.println();
		}
		
		System.out.println("¦�� ���� : " + sum[0]);
		System.out.println("Ȧ�� ���� : " + sum[1]);
	}
}
