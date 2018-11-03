package kr.ac.smu.day08.abs02;

import java.util.Scanner;

public class Menu {

	private int choiceMenu() {  //내부에서만 가능하다.실제 외부에서는 알수 없다. 여기 자체에서만 돈다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 프린터를 선택(1. LG,  2. SAMSUNG,  3.HP)");
		
		int type = sc.nextInt();
		sc.nextLine();
		
		return type;
	}
	
	public void process() {
		
		Printer p = null;  //상속관계일때만 객체형변환 할 수 있다.(업 캐스팅, 다운 캐스팅);
		
		int type = choiceMenu();
		switch(type) {
		case 1://자식의 인스턴스 객체를 만들엇고 부모가 가지고 있는 메소드를 실행한다. 부모타입의 변수 사용가능.
			p = new LGPrinter();
			//lg.lgPrint();
			//p.print();  //상속받으면 오버라이딩.
			break;
		case 2:
			p = new SamsungPrinter();
			//ss.samsungPrint(); 
			//p.print(); //상속받으면 오버라이딩.
			break;
		case 3 :
			p = new HPPrinter();
			//p.print();
			break;
		}
		
		if(p != null) {
			p.print();
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
//		switch(type) {
//		case 1://자식의 인스턴스 객체를 만들엇고 부모가 가지고 있는 메소드를 실행한다. 부모타입의 변수 사용가능.
//			Printer lg = new LGPrinter();
//			//lg.lgPrint();
//			lg.print();  //상속받으면 오버라이딩.
//			break;
//		case 2:
//			Printer ss = new SamsungPrinter();
//			//ss.samsungPrint(); 
//			ss.print(); //상속받으면 오버라이딩.
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
//			lg.print();  //상속받으면 오버라이딩.
//			break;
//		case 2:
//			SamsungPrinter ss = new SamsungPrinter();
//			ss.samsungPrint(); 
//			ss.print(); //상속받으면 오버라이딩.
//			break;
//		case 3 :
//			HPPrinter hp = new HPPrinter();
//			hp.print();
//			break;
//		}
		
		//모든 프린터는 출력기능이 무조건 있다. => 상속 개념. 프린트해주는 class생성.
	}
}
