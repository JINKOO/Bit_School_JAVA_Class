package kr.ac.smu.day02;

import java.util.Scanner;
public class ScannerMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//������ ���� ������ �߻��Ѵ�.
		//�Է� ���۸� ����ϱ� ������ �����(��� ���� �߻��Ѵ�).
		//�Է� ���۴� �ӵ��� ������ �ϱ� ���� ����Ѵ�.
		
		System.out.println("������ �Է� : ");
		int num1 = sc.nextInt();
		sc.nextLine(); //���۸� ���°�. ���͸� ���ֱ� ����.
		
		System.out.println("���ڸ� �Է�: ");
		char c = sc.nextLine().charAt(0); //enter�� ���ڷ� ����Ѵ�. buffer�� ���͸� �����ִ�. enter�� �����ֱ� ������
		
		
		//���� �Ǽ� �Է� �޴� ��쿡�� �ٿ��ش�. ���۸� �����ϰ� �ϱ� ����.
		//int num3 = Integer.parseInt(sc.nextLine());
		
		System.out.println("������ �Է�: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num1 : " + num1 + ", ch : " + c);
		System.out.println("num2 : " + num2);
		
	}
}
