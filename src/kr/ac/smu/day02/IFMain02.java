package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * ����Ѵ�.
 * ������ ����� �ð��� 8�� �����̸� => �ɾ
 *               8�� �����ϸ� => ����Ÿ��
 * �б�����.
 */

public class IFMain02 {

	public static void main(String[] args) {
		
		System.out.println("����Ѵ�.");
		System.out.println("������ ����� �ð��� �Է��ϼ���(7�� 50���̶�� 7.50): ");
		
		Scanner sc = new Scanner(System.in);
		
		double time = sc.nextDouble();
		sc.nextLine();
		
		if(time < 8.00) {
			
			System.out.println("�ɾ");
		}
		
		else{ //�ڹٿ��� else�� �̷��� ����.
			
			System.out.println("����Ÿ��");
		}
		
		//if�� else ���̿��� �ٸ� �ڵ� ������ �ȵȴ�.
		System.out.println("�б�����.");
	}
}
