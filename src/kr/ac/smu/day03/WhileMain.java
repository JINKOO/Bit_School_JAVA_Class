package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * 
 * 1.�ʱ�ȭ
 * while(2.��������) {
 *    3.���๮��
 *    4.����/����
 *}
 *5.����
 *
 *1. �ʱ�ȭ;
 * do{
 *    3.���๮��;
 *    4.��������
 * }while(2.��������);   1->3->4 ->2 2�� ���̸� 3�� ����.
 * 5.����
 * 
 */

public class WhileMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("1.�α���  2.ȸ������  3.����");

		do {
			System.out.println("�޴��� �Է��ϼ���: ");
			num = sc.nextInt();
			sc.nextLine();

			switch (num) {

			case 1:
				System.out.println("�Ƶ��: ");
				System.out.println("��� ��ȣ: ");
				break;
			case 2:
				System.out.println("������ ���̵� �Է�: ");
				System.out.println("������ ��й�ȣ �Է�: ");
				break;
			case 3:
				System.out.println("���α׷��� ����˴ϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("�޴� ��ȣ �ٽ� �Է��ϼ���");
			}

		} while (num != 0);

		System.out.println("�ٸ� �������� �Ѿ�ðڽ��ϱ�?");
	}
}
