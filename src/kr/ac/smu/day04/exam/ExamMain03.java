package kr.ac.smu.day04.exam;

/*
 * ���� ���ϴ� ��ī����.
 */
public class ExamMain03 {

	public static void main(String[] args) {

		//int sum = 1; //sum�� �󸶷� �ʱ�ȭ�� ���� for���� ������ �޶����� �Ѵ�.
		int sum = 0; //but������ for������ ��𼭺��� ������ ���Ұ��� ���� �� ���̰� �ϱ����� sum = 0;
		for(int i = 1; i<=5; i++) {
			sum = sum + i;
		}
		System.out.printf("1-5������ ���� : %d\n", sum);
	}
}
