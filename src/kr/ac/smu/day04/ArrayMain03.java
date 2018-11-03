package kr.ac.smu.day04;

import java.util.Arrays;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] nums = {10,20,30,40,50};
		int[] nums2 = new int[5];
		//int[] nums2 = null; //이렇게 하면 잘못된 것이다. (nullpoint예외 발생 내가 가리키는 배열이 없기 때문에(heap영역에 공간이 안만들어져서)
		
		System.out.println("<nums PRINT>");
		for(int i = 0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("<nums2 PRINT>");
		for(int i:nums2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// nums의 복사본을 생성하기.
//		nums2[0] = nums[0];
//		nums2[1] = nums[1];
//		nums2[2] = nums[2];
//		nums2[3] = nums[3];
//		nums2[4] = nums[4];
		
//		for(int i = 0; i<nums.length; i++) {
//			nums2[i] = nums[i];
//		}
		
		System.arraycopy(nums, 0, nums2, 0, nums.length);
		System.arraycopy(nums, 0, nums2, 2, 2);
		
		System.out.println("복사완료..");
		System.out.println("nums  : " + Arrays.toString(nums));
		System.out.println("nums2 : " + Arrays.toString(nums2));
	}
}
