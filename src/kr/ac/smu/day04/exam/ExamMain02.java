package kr.ac.smu.day04.exam;

import java.util.Random;

/*
 * <10°³ÀÇ ³­¼ö Ãâ·Â> //1-10»çÀÌÀÇ ³­¼ö
 * 3 4 7 1 4 3 6 2 3
 * 
 * <Â¦¼ö>
 * 4 2
 * ÃÑ °³¼ö: 
 * ÃÑÇÕ :
 * 
 * <È¦¼ö>
 * 3 7 1 3 3
 * ÃÑ °³¼ö:
 * ÃÑÇÕ:
 */
public class ExamMain02 {
	public static void main(String[] args) {

		Random r = new Random();
		
		int[] arr = new int[10];
		int count = 0;
		int sum = 0;
		
		System.out.println("³­¼ö 10°³ Ãâ·Â");
	
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("<<Â¦¼ö>>");
		for(int num : arr) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
				sum = sum + num;
				count++;
			}
		}
		
		System.out.printf("ÃÑ °³¼ö : %d\n", count);
		System.out.printf("ÃÑ   ÇÕ : %d\n", sum);
		System.out.println();
		
		count = 0;
		sum = 0;
		System.out.println("<<È¦¼ö>>");
		for(int num : arr) {
			if(num % 2 != 0) {
				System.out.print(num + " ");
				sum = sum + num;
				count++;
			}
		}
		System.out.println();
		System.out.printf("ÃÑ °³¼ö : %d\n", count);
		System.out.printf("ÃÑ   ÇÕ : %d\n", sum);
	}
}
