package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * ���� if�� �� ��ø�� if���� ������� �ڵ�� �����ֱ� ���� ���.
 */

public class IFMain {

	public static void main(String[] args) {
		
		System.out.println("����Ѵ�.");
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �ð� �Է�: ");
		
		double time = sc.nextDouble();
		sc.nextLine();
		
		if(time < 8.00) {
			System.out.println("�ɾ");
		} else if(time < 8.15) {
			System.out.println("����Ÿ��");
		} else { /*���ǽ� 1����, ���ǽ�2�� ����*/
			System.out.println("�ý�Ÿ��");
		}
		
		System.out.println("�б�����.");
		sc.close();
	}
}
