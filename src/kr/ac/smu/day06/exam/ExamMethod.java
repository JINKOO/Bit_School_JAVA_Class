package kr.ac.smu.day06.exam;

import java.util.Random;
import java.util.Scanner;

public class ExamMethod {

	/**
	 * 호출자 메소드가 정수2개를 넘겨주면 2개의 총합을 구해서 호출자메소드에 결과 반환
	 * 
	 * @param num1
	 * @param num2
	 * @return 총 합
	 */

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * 키보드로 하나의 정수를 입력 받고, 그 정수를 호출자 메소드로 반환
	 */
	public int getInt() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력: ");
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}

	/**
	 * 호출자가 넘겨준 두 정수 사이의 총합을 반환하는 기능.
	 * 
	 * @param num1
	 * @param num2
	 * @return 총 합
	 */

	public int getSum(int num1, int num2) {

		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public void displayTotalSum(int num1, int num2, int total) {

		System.out.printf("%d ~ %d까지 총 합 : %d", num1, num2, total);
	}

	/**
	 * 1~100사이의 난수를 10개 추출하여 반환
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
//		int[] arr = this.getNums(10);//this: 자기 참조 변수(이미 생성된 객체를 호출할때) 하지만 자신의 class에 있는 메소드 호출할때는 this생략.
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
	 * 1~max사이의 난수를 size개 추출하여 반환
	 * @param size
	 *  추출할 난수 개수
	 * @param max
	 *  추출할 난수 범위
	 * @return
	 *  추출된 난수 배열
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
		System.out.println("<<총 " + arr.length + "개의 정수 출력>>");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
