package kr.ac.smu.day03;

/*
 * for�� ��ø => �ڵ��� ��켱 ������� ��������.
 * �����ϸ� 2�� ��Ǫ������ ����. �ӵ� 3�� ������ n3
 * 
 */

public class BreakMain02 {

	public static void main(String[] args) {
		
		first:for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j<=5; j++) {
				System.out.print(i);
				if(i==1) {
					break first; //�ʿ��� ������ ���������� �ִ� Ű���� ����� �ִ�.
					//continue first;
				}
			}
			System.out.println();
		}
	}
}
