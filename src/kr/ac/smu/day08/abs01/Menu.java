package kr.ac.smu.day08.abs01;

import java.util.Scanner;

public class Menu {

	private int choiceMenu() {  //���ο����� �����ϴ�.���� �ܺο����� �˼� ����. ���� ��ü������ ����.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �����͸� ����(1. LG,  2. SAMSUNG)");
		
		int type = sc.nextInt();
		sc.nextLine();
		
		return type;
	}
	
	public void process() {
		
		int type = choiceMenu();
		switch(type) {
		case 1:
			LGPrinter lg = new LGPrinter();
			//lg.lgPrint();
			lg.print();  //��ӹ����� �������̵�.
			break;
		case 2:
			SamsungPrinter ss = new SamsungPrinter();
			//ss.samsungPrint(); 
			ss.print(); //��ӹ����� �������̵�.
			break;
		}
		
		//��� �����ʹ� ��±���� ������ �ִ�. => ��� ����. ����Ʈ���ִ� class����.
	}
}
