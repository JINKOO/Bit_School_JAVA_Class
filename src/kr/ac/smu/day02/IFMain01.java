package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * ����Ѵ�.
 * ��԰� 
 * �б�����.
 * --------
 * ����Ѵ�.
 * �б�����.
 * 
 * ���ð���  7�������̶�� ���� �԰� �б�����.
 *         7�����Ķ�� �б��Ѵ�.
 */
public class IFMain01 {

	public static void main(String[] args) {
		
		System.out.println("����Ѵ�.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �ð� �Է��ϼ���(6��45�� => 645) : ");
		
		int time = sc.nextInt();
		sc.nextLine(); //���� ����ش�.
		
		if(time < 700) {
			System.out.print("��԰�, ");
		}
		System.out.println("�б�����.");
	}
}
