package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * if���� ���ǹ��� �� �Ѱ��� ����
 * switch���� ���� ���� ����.(break�� ������)
 * ��κ� switch���� �޴����鶧 �� ����.
 * 
 * break���� swtich���� �ݺ���������
 * if�������� break������. �� if���� switch�� �ݺ����� �ȿ� �������� ����.
 * 
 */
public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1-3������ ���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) { //default�� ��ġ�� �������. case�� å���ǿ��� break�������� {}�� �ٺ���.
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("error");
		}
		sc.close();
	}
}
