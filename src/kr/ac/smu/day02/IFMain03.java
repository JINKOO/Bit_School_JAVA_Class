package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * ����Ѵ�.
 * ��߽ð��� 8�� �����̸� �ɾ
 *        8��~8��15�� ���̸� ����Ÿ��
 *        8��15�����Ķ�� �ý�Ÿ��
 * �б�����.
 * 
 */

public class IFMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �ð��� �Է��ϼ���(8�ö��=>8.00");
		
		double time = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("����Ѵ�.");
//		if(time < 8.00) { //���ǹ� 1
//			
//			System.out.println("�ɾ");
//		
//		} else { //��ø�� if else�� ���ǹ�1�� �����ΰ͵� �ؼ��ϴ� ���� �߿��ϴ�.
//			
//			if(time < 8.15) { //���ǹ�1�� �����ΰ͵� �߿� ���ǹ� 2�� ���ΰ��.���� time>8.00 && time <8.15���ص� �ȴ�.
//				
//				System.out.println("����Ÿ��");
//			
//			} else { //���ǹ�1�� �����ΰ͵� �߿� ���ǹ� 2�� ������ �ܿ�
//		
//				System.out.println("�ý�Ÿ��");
//			}
//		}
		
		if(time < 8.15) {
			
			if(time < 8.00) {
				System.out.println("�ɾ");
			} else { //8�ÿ� 8��15�л���
				System.out.println("����Ÿ��");
			}
			
		} else {
			System.out.println("�ý�Ÿ��");
		}
		
		System.out.println("�б�����.");
	}
}
