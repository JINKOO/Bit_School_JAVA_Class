package kr.ac.smu.day04.exam;

/*
 *  5개의 정수를 입력받아 출력하는 코드를 작성(단, 다음의 규칙을 적용하여 작성)


	1번째 정수 입력 : 5
	2번째 정수 입력 : 17
	3번째 정수 입력 : 8
		정수 입력은 5, 17보다 커야합니다
	3번째 정수 입력 : 19
	4번째 정수 입력 : 25
	5번째 정수 입력 : 9
		정수 입력은 5, 17, 19, 25보다 커야합니다
	5번째 정수 입력 : 20
		정수 입력은 5, 17, 19, 25보다 커야합니다
	5번째 정수 입력 : 32
	
	<5개의 정수 출력>
	5  17  19  25  32
	
 */

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		for(int i = 0; i<nums.length; ) { //증감식 생략 가능하다. 올바르게 입력했을때만 i를 증가시킨다.
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			sc.nextLine(); //버퍼 비워주기 위해
			
			if(i != 0 && nums[i] < nums[i-1]) { //0번째는 입력받기만 하면 된다.//이미 오름차순으로 정렬되있기 때문에 자기 바로 앞보다 크기만 하면 된다.
				System.out.print("\t정수 입력은 ");
				for(int j = 0; j<i; j++) {
					System.out.print(nums[j]);
					if(j != i-1)//,찍는 경우 
						System.out.print(", ");
				}
				System.out.println("보다 커야합니다.");
			
			} else {
				i++;
			}
		}
		
		sc.close();
		System.out.println();
		System.out.println("< PRINT >");
		System.out.println(Arrays.toString(nums));
	}
}
