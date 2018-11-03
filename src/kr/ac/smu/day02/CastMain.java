package kr.ac.smu.day02;

/*
 *  byte < short, char < int < long < float < double
 *  
 *  ����ȯ(�⺻ �ڷ��� ������) ���� �ڷ����� ������ �ٸ���.
 *  �����ڸ� �������� �¿��� ���������� �ٸ� ��� �߻�.
 *  3 + 12.34 => + �������� �� �� ������ ���� �ٸ���.
 *  
 *  ����ȯ ����
 *  -������ ����ȯ
 *   �ڷ����� ũ�Ⱑ ���� �������� ũ�Ⱑ ū �ڷ������� ���ԵǴ� ��� �߻�.
 *  -�����(������) ����ȯ
 *   �ڷ����� ũ�Ⱑ ū �ڷ��� ������ ���� ũ���� �ڷ����� ���ԵǴ� ��� �߻�.
 *   
 */

public class CastMain {

	public static void main(String[] args) {
		
		double d = 12.34; //double���̴�.
		d = /*(double)*/12; 
		//������ ����ȯ (double) Ű���� ���� ����.
		//double�� ������ int�� ���� => ����ȯ �߻�. int�� double�� ��ȯ.
		
		d = /*(double)*/12 + 34.5;
		//������ ����ȯ
		//int + double //����ȯ �߻�. +�� �������� �¿찡 ���������� �ٸ���.
		
		int num = 12;
		num = (int)12.34; 
		//������(�����) ����ȯ Ű���� ���� �Ұ���.
		//=�� �������� �¿찡 �ٸ���. int���� double�� �����Ϸ��Ѵ�. // ����ȯ �߻�
		//��) ��� ���� ��.
		
		int a = 12, b = 5;
		double avg1 = ((double)a+b)/2;  //����� ��κ� double�� ����.
		double avg2 = (double)(a + b) / 2; 
		double avg3 = (a + b) / 2.; //(int + int) / double
		//(int + int) / int => int�� ���´�.
		
		System.out.println(a + ", " + b + " ��� : " + avg1);
		System.out.println(a + ", " + b + " ��� : " + avg2);
		System.out.println(a + ", " + b + " ��� : " + avg3);
		
	}
}
