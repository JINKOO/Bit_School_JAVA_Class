package kr.ac.smu.day04;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		//3X4 이차원 생성
/*		
		//int[][] nums = new int[3][4]; //heap영역에 4개 덩어리가 만들어짐.
		int[][] nums = new int[3][];    //현재 참조 배열은 null
		
		//동적 할당 할때는 2차원 배열에서 각 참조 배열의 길이는 다를 수 있다.
		for(int i = 0; i<nums.length; i++) {
			nums[i] = new int[i+2];   //각 참조배열이 가리키는 공간 생성. 
		}
*/		
		
		int[][] nums = {new int[4], new int[3], new int[2]};//{{0,0,0,0},{0,0,0},{0}};
		System.out.println("nums : " + nums);
		System.out.println("nums[0] : " + nums[0]);
		System.out.println("nums[1] : " + nums[1]);
		System.out.println("num[0].length : " + nums[0].length);
		System.out.println("num[1].length : " + nums[1].length);
		System.out.println("num[2].length : " + nums[2].length);
		
		
		//각 원소 출력
		for(int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		for(int i = 0; i<nums.length; i++) {
			for(int num : nums[i]) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		for(int[] arr : nums) {
			for(int i = 0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
		//1.5버전 for문 사용시 차수를 낮출 수 있다.
		System.out.println("-----------------------------");
		for(int[] arr : nums) {
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
