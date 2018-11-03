package kr.ac.smu.day04.exam;

import java.util.Random;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println("<<PRINT>>");
		
		//초기화
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(99) + 1;
			//System.out.print(num + " ");
		}
		
		for(int num: arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("<REVERSE>");
		for(int i = arr.length-1; i>=0; i--) { //int i = 상수 로 해도 되지만 배열은 동적할당이기때문에 변수로 하는 것이 좋아
			//35->53
			int n10 = arr[i] / 10;
			int n1 = arr[i] % 10;
			System.out.print(n1 * 10 + n10 + " ");
		}
		System.out.println();
	}
}
