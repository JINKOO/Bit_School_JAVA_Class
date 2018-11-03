package kr.ac.smu.day04.exam;

import java.util.Random;

/*
 * <10개의 난수 출력> //1-10사이의 난수
 * 3 4 7 1 4 3 6 2 3
 * 
 * <짝수>
 * 4 2
 * 총 개수: 
 * 총합 :
 * 
 * <홀수>
 * 3 7 1 3 3
 * 총 개수:
 * 총합:
 */

public class ExamMain01 {

	public static void main(String[] args) {

		Random r = new Random();

		int[] arr = new int[10];

		System.out.println("<난수 발생>");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			System.out.printf(arr[i] + " ");

		}
		System.out.println();

		// 한 for문안에서 짝수인지 홀수인지 판단하는 if문 쓰면 결국 모든 원소 가 다나와.
		// 짝수 따로 홀수 따로 해야해. for문 2개
		/*
		 * System.out.print("짝수만 출력: "); 
		 * for(int num : arr) { 
		 *   if(num %2 == 0)
		 *      System.out.print(num + " "); 
		 * } 
		 * System.out.println();
		 * 
		 * System.out.print("홀수만 출력 : "); 
		 * for(int i = 0; i<arr.length; i++) { 
		 *    if(arr[i] % 2 !=0) { 
		 *       System.out.print(arr[i] + " "); 
		 *       } 
		 * }
		 */

		int[] sum = new int[2];
		String[] title = {"짝수", "홀수"};
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
		
		System.out.println("짝수 총합 : " + sum[0]);
		System.out.println("홀수 총합 : " + sum[1]);
	}
}
