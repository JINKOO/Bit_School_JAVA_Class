package kr.ac.smu.day03;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϴ� ���� �Է�: ");
		String season = sc.next();
		
		switch(season) {
		case "��":
			System.out.println(season);
			break;
		case "����":
			System.out.println(season);
			break;
		case "����":
			System.out.println(season);
			break;
		case "�ܿ�":
			System.out.println(season);
			break;
		default:
			System.out.println("�ٽ� �Է�");
		}
	}
}
