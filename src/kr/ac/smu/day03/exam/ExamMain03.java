package kr.ac.smu.day03.exam;

/*
 * �����̰� 100M������ �칰�� ������.
 * �ð��� 5M�ӵ��� �칰�� ��� ������.
 * �����̰� �ö� �칰�� ���̰� 50M�̸��̸� -1m/h
 *                     50M�̻��̸� -2m/h
 *                     
 * [1�ð���] �����̰� �ö� �ѳ��� : 4m
 * [2�ð���] �����̰� �ö� �ѳ��� : 8m
 * ...
 * [xx�ð���] �����̰� �ö� �ѳ��� : 100m 101m ...
 * 
 */

public class ExamMain03 {

	public static void main(String[] args) {

		int hour = 0;
		int snail = 0;
		
		while(snail < 100) {
			
			snail += (snail < 50 ? 5-1:5-2);	
			System.out.println("[" + ++hour + "]" + "�����̰� �ö� �� ���� : " + snail + "M");
		
		}
//		while ((snail+=5) < 100) { //�����̴� 100M�ѱ⸸ �ϸ� Ż��
//			
//			//snail = snail + 5;
//			if (snail < 50) {
//				snail = snail - 1;
//			} else {
//				snail = snail - 2;
//			}
//
//			System.out.println("[" + ++hour + "]" + "�����̰� �ö� �� ���� : " + snail + "M");
//		}
//		System.out.println("[" + ++hour + "]" + "�����̰� �ö� �� ���� : " + snail + "M");
	}
}
