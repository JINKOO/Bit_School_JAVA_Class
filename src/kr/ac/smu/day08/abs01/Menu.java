package kr.ac.smu.day08.abs01;

import java.util.Scanner;

public class Menu {

	private int choiceMenu() {  //내부에서만 가능하다.실제 외부에서는 알수 없다. 여기 자체에서만 돈다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 프린터를 선택(1. LG,  2. SAMSUNG)");
		
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
			lg.print();  //상속받으면 오버라이딩.
			break;
		case 2:
			SamsungPrinter ss = new SamsungPrinter();
			//ss.samsungPrint(); 
			ss.print(); //상속받으면 오버라이딩.
			break;
		}
		
		//모든 프린터는 출력기능이 무조건 있다. => 상속 개념. 프린트해주는 class생성.
	}
}
