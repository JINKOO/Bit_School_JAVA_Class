package kr.ac.smu.day08.abs02;

import java.util.Scanner;

public class Menu {

	private int choiceMenu() {  //���ο����� �����ϴ�.���� �ܺο����� �˼� ����. ���� ��ü������ ����.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �����͸� ����(1. LG,  2. SAMSUNG,  3.HP)");
		
		int type = sc.nextInt();
		sc.nextLine();
		
		return type;
	}
	
	public void process() {
		
		Printer p = null;  //��Ӱ����϶��� ��ü����ȯ �� �� �ִ�.(�� ĳ����, �ٿ� ĳ����);
		
		int type = choiceMenu();
		switch(type) {
		case 1://�ڽ��� �ν��Ͻ� ��ü�� ������� �θ� ������ �ִ� �޼ҵ带 �����Ѵ�. �θ�Ÿ���� ���� ��밡��.
			p = new LGPrinter();
			//lg.lgPrint();
			//p.print();  //��ӹ����� �������̵�.
			break;
		case 2:
			p = new SamsungPrinter();
			//ss.samsungPrint(); 
			//p.print(); //��ӹ����� �������̵�.
			break;
		case 3 :
			p = new HPPrinter();
			//p.print();
			break;
		}
		
		if(p != null) {
			p.print();
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		
//		switch(type) {
//		case 1://�ڽ��� �ν��Ͻ� ��ü�� ������� �θ� ������ �ִ� �޼ҵ带 �����Ѵ�. �θ�Ÿ���� ���� ��밡��.
//			Printer lg = new LGPrinter();
//			//lg.lgPrint();
//			lg.print();  //��ӹ����� �������̵�.
//			break;
//		case 2:
//			Printer ss = new SamsungPrinter();
//			//ss.samsungPrint(); 
//			ss.print(); //��ӹ����� �������̵�.
//			break;
//		case 3 :
//			Printer hp = new HPPrinter();
//			hp.print();
//			break;
//		}
		
//		switch(type) {
//		case 1:
//			LGPrinter lg = new LGPrinter();
//			lg.lgPrint();
//			lg.print();  //��ӹ����� �������̵�.
//			break;
//		case 2:
//			SamsungPrinter ss = new SamsungPrinter();
//			ss.samsungPrint(); 
//			ss.print(); //��ӹ����� �������̵�.
//			break;
//		case 3 :
//			HPPrinter hp = new HPPrinter();
//			hp.print();
//			break;
//		}
		
		//��� �����ʹ� ��±���� ������ �ִ�. => ��� ����. ����Ʈ���ִ� class����.
	}
}
