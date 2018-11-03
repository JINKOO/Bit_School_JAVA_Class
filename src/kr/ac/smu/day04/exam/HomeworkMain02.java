package kr.ac.smu.day04.exam;

/*
 *  5���� ������ �Է¹޾� ����ϴ� �ڵ带 �ۼ�(��, ������ ��Ģ�� �����Ͽ� �ۼ�)


	1��° ���� �Է� : 5
	2��° ���� �Է� : 17
	3��° ���� �Է� : 8
		���� �Է��� 5, 17���� Ŀ���մϴ�
	3��° ���� �Է� : 19
	4��° ���� �Է� : 25
	5��° ���� �Է� : 9
		���� �Է��� 5, 17, 19, 25���� Ŀ���մϴ�
	5��° ���� �Է� : 20
		���� �Է��� 5, 17, 19, 25���� Ŀ���մϴ�
	5��° ���� �Է� : 32
	
	<5���� ���� ���>
	5  17  19  25  32
	
 */

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		for(int i = 0; i<nums.length; ) { //������ ���� �����ϴ�. �ùٸ��� �Է��������� i�� ������Ų��.
			System.out.print(i+1 + "��° ���� �Է� : ");
			nums[i] = sc.nextInt();
			sc.nextLine(); //���� ����ֱ� ����
			
			if(i != 0 && nums[i] < nums[i-1]) { //0��°�� �Է¹ޱ⸸ �ϸ� �ȴ�.//�̹� ������������ ���ĵ��ֱ� ������ �ڱ� �ٷ� �պ��� ũ�⸸ �ϸ� �ȴ�.
				System.out.print("\t���� �Է��� ");
				for(int j = 0; j<i; j++) {
					System.out.print(nums[j]);
					if(j != i-1)//,��� ��� 
						System.out.print(", ");
				}
				System.out.println("���� Ŀ���մϴ�.");
			
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
