package kr.ac.smu.day04;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		//3X4 ������ ����
/*		
		//int[][] nums = new int[3][4]; //heap������ 4�� ����� �������.
		int[][] nums = new int[3][];    //���� ���� �迭�� null
		
		//���� �Ҵ� �Ҷ��� 2���� �迭���� �� ���� �迭�� ���̴� �ٸ� �� �ִ�.
		for(int i = 0; i<nums.length; i++) {
			nums[i] = new int[i+2];   //�� �����迭�� ����Ű�� ���� ����. 
		}
*/		
		
		int[][] nums = {new int[4], new int[3], new int[2]};//{{0,0,0,0},{0,0,0},{0}};
		System.out.println("nums : " + nums);
		System.out.println("nums[0] : " + nums[0]);
		System.out.println("nums[1] : " + nums[1]);
		System.out.println("num[0].length : " + nums[0].length);
		System.out.println("num[1].length : " + nums[1].length);
		System.out.println("num[2].length : " + nums[2].length);
		
		
		//�� ���� ���
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
		
		//1.5���� for�� ���� ������ ���� �� �ִ�.
		System.out.println("-----------------------------");
		for(int[] arr : nums) {
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
